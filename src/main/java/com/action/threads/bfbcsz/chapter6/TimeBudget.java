package com.action.threads.bfbcsz.chapter6;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public class TimeBudget {

    private static ExecutorService exec = Executors.newCachedThreadPool();


    public List<TravelQuote> getRankedTravelQuotes(
            TravelInfo travelInfo, Set<TravelCompany> companies,
            Comparator<TravelQuote> ranking, long time, TimeUnit unit)
            throws InterruptedException {


        List<QuoteTask> tasks = new ArrayList<>();
        companies.forEach(company -> tasks.add(new QuoteTask(company, travelInfo)));

        List<Future<TravelQuote>> futures = exec.invokeAll(tasks, time, unit);

        List<TravelQuote> quotes = new ArrayList<>(tasks.size());
        Iterator<QuoteTask> taskIterator = tasks.iterator();
        futures.forEach(future -> {
            QuoteTask task = taskIterator.next();
            try {
                quotes.add(future.get());

            } catch (ExecutionException e) {
                quotes.add(task.getFailureQuote(e.getCause()));
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (CancellationException e) {
                quotes.add(task.getTimeoutQuote(e));
            }


        });
        quotes.sort(ranking);

        return quotes;
    }


    class QuoteTask implements Callable<TravelQuote> {

        private final TravelCompany company;
        private final TravelInfo travelInfo;

        QuoteTask(TravelCompany company, TravelInfo travelInfo) {
            this.company = company;
            this.travelInfo = travelInfo;
        }

        TravelQuote getFailureQuote(Throwable t) {
            return null;
        }

        TravelQuote getTimeoutQuote(CancellationException e) {
            return null;
        }


        @Override
        public TravelQuote call() throws Exception {
            return company.solicitQuote(travelInfo);
        }
    }


    interface TravelCompany {
        TravelQuote solicitQuote(TravelInfo travelInfo) throws Exception;
    }

    interface TravelQuote {
    }

    interface TravelInfo {
    }

}
