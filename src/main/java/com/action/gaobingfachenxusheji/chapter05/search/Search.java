package com.action.gaobingfachenxusheji.chapter05.search;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Search {

    static ExecutorService pool = Executors.newCachedThreadPool();
    static final int Thread_Num = 2;
    static AtomicInteger result = new AtomicInteger(-1);

    static int[] arr;


    public static int search(int searchValue, int beginPos, int endPos) {
        int i = 0;
        for (i = beginPos; i < endPos; i++) {
            if (result.get() >= 0) {
                return result.get();
            }
            if (arr[i] == searchValue) {
                // 如果设置失败，则表示其他线程已经先找到
                if (!result.compareAndSet(-1, i)) {
                    return result.get();
                }
                return i;
            }
        }
        return -1;
    }


    public static class SearchTask implements Callable<Integer> {

        int begin, end, searchValue;

        public SearchTask(int searchValue, int begin, int end) {
            this.begin = begin;
            this.end = end;
            this.searchValue = searchValue;
        }

        @Override
        public Integer call() throws Exception {
            return search(searchValue, begin, end);
        }
    }

    public static int pSearch(int searchValue) throws ExecutionException, InterruptedException {

        int subArraySize = arr.length / Thread_Num + 1;
        List<Future<Integer>> re = new ArrayList<>();
        for (int i = 0; i < arr.length; i += subArraySize) {
            int end = i + subArraySize;
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            re.add(pool.submit(new SearchTask(searchValue, i, end)));
        }

        for (Future<Integer> fu : re) {
            if (fu.get() >= 0) {
                return fu.get();
            }
        }
        return -1;

    }


}
