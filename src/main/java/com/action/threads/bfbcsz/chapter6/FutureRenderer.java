package com.action.threads.bfbcsz.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public abstract class FutureRenderer {

    private final ExecutorService executor = Executors.newCachedThreadPool();

    void renderPage(CharSequence source) {
        final List<ImageInfo> imageInfos = scanForImageInfo(source);
        Callable<List<ImageData>> task = () -> {
            List<ImageData> result = new ArrayList<>();
            imageInfos.forEach(ImageInfo::downloadImage);
            return result;
        };
        Future<List<ImageData>> future = executor.submit(task);
        // 异步执行 再执行 其他
        renderText(source);

        // 获取异步执行结果
        try {
            List<ImageData> imageData = future.get();
            imageData.forEach(this::renderImage);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            future.cancel(true);
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    interface ImageData {
    }

    interface ImageInfo {
        ImageData downloadImage();
    }

    abstract void renderText(CharSequence s);

    abstract List<ImageInfo> scanForImageInfo(CharSequence s);

    abstract void renderImage(ImageData i);

}
