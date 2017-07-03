package com.action.threads.bfbcsz.chapter6;

import java.util.concurrent.*;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public class RenderWithTimeBudget {

    private static final Ad DEFAULT_AD = new Ad();
    private static final long TIME_BUGGET = 1000;

    private static final ExecutorService exec = Executors.newCachedThreadPool();

    Page renderPageWithAd() throws InterruptedException {
        long endNanos = System.nanoTime() + TIME_BUGGET;
        Future<Ad> future = exec.submit(new FetchAdTask());
        Page page = renderPageBody();

        Ad ad;
        try {
            long timeLeft = endNanos - System.nanoTime();
            ad = future.get(timeLeft, TimeUnit.NANOSECONDS);
        } catch (ExecutionException e) {
            ad = DEFAULT_AD;
            e.printStackTrace();
        } catch (TimeoutException e) {
            ad = DEFAULT_AD;
            future.cancel(true);
            e.printStackTrace();
        }

        page.setAd(ad);
        return page;
    }

    Page renderPageBody() {
        return new Page();
    }

    static class Ad {
    }

    static class Page {
        public void setAd(Ad ad) {
        }
    }

    static class FetchAdTask implements Callable<Ad> {

        @Override
        public Ad call() throws Exception {
            return new Ad();
        }
    }

}
