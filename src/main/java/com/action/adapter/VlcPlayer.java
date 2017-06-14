package com.action.adapter;

/**
 * 创建AdvancedMediaPlayer接口实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
