package com.action.adapter;

/**
 * 创建实现了 MediaPlayer
 * Created by wuyunfeng on 2017/6/14.
 */
public class AudioPlayer implements MediaPlayer {


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
