package com.action.threads.bfbcsz.chapter6;

import java.util.List;
import java.util.concurrent.*;

/**
 * Created by wuyunfeng on 2017/7/3.
 */
public abstract class Renderer {



    private final ExecutorService executor;

    public Renderer(ExecutorService executor) {
        this.executor = executor;
    }

    void renderPage(CharSequence source){
        List<ImageInfo> infos = scanForImageInfo(source);
        CompletionService<ImageData> completionService = new ExecutorCompletionService<>(executor);
        infos.forEach(imageInfo ->  completionService.submit(imageInfo::downloadImage));
        renderText(source);


        try {
            for (int t = 0; t < infos.size(); t++){
                Future<ImageData> future = completionService.take();
                ImageData imageData = future.get();
                renderImage(imageData);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
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
