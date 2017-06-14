package com.action.adapter;

/**
 * 创建AdvancedMediaPlayer 的 Mp4Player 实体类
 * Created by wuyunfeng on 2017/6/14.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
