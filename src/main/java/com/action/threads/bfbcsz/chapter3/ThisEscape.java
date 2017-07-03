package com.action.threads.bfbcsz.chapter3;

/**
 * Created by wuyunfeng on 2017/6/28.
 */
public class ThisEscape {
    public ThisEscape(EventSource source) {
        source.registerListener(new EventListener() {
            public void onEvent(Event e) {
                doSomething(e);
            }
        });
    }

    void doSomething(Event e) {
    }


    interface EventSource {
        void registerListener(EventListener e);
    }

    interface EventListener {
        void onEvent(Event e);
    }

    interface Event {
    }

    public static void main(String[] args) {
        new ThisEscape(new EventSource() {
            @Override
            public void registerListener(EventListener e) {

            }
        });
    }
}