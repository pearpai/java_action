package com.action.threads.bfbcsz.chapter5;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by wuyunfeng on 2017/6/29.
 */
public class FileCrawler implements Runnable {
    private final BlockingQueue<File> fileQueue;
    private final FileFilter fileFilter;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileQueue, final FileFilter fileFilter, File root) {
        this.fileQueue = fileQueue;
        this.fileFilter = pathname -> pathname.isDirectory() || fileFilter.accept(pathname);
        this.root = root;
    }

    @Override
    public void run() {
        try {
            crawl(root);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean alreadyIndexed(File f) {
        return false;
    }

    private void crawl(File root) throws InterruptedException {
        File[] entries = root.listFiles(fileFilter);
        if (entries != null) {
            for (File entry : entries) {
                if (entry.isDirectory())
                    crawl(entry);
                else if (!alreadyIndexed(entry)){
                    fileQueue.put(entry);
                    System.out.println(entry);
                    System.out.println(fileQueue.size());
                }
            }
        }
    }

    static class Indexer implements Runnable {
        private final BlockingQueue<File> queue;

        public Indexer(BlockingQueue<File> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(queue.size());
                    indexFile(queue.take());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public void indexFile(File file) {
            // Index the file...
        }

        ;
    }

    public static final int BOUND = 100; // 队列中保存的数据数量
//    返回机器 cpu的线程数
    public static final int N_CONSUMERS = Runtime.getRuntime().availableProcessors();

    public static void startIndexing(File[] roots) {
        BlockingQueue<File> queue = new LinkedBlockingQueue<>(BOUND);
        FileFilter filter = pathname -> true;
//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return true
//            }
//        };

        Arrays.stream(roots).forEach(root -> new Thread(new FileCrawler(queue, filter, root)).start());

        System.out.println("-----------------" + N_CONSUMERS);
        for (int i = 0; i < N_CONSUMERS; i++) {
            new Thread(new Indexer(queue)).start();
        }
    }


    public static void main(String[] args) {

        File[] roots = new File[]{new File("/Users/wuyunfeng/Downloads/")};
        startIndexing(roots);

    }
}
