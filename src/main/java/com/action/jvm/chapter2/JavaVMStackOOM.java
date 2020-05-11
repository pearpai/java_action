package com.action.jvm.chapter2;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-11 22:55
 * VM Args：-Xss2M （这时候不妨设大些，请在32位系统下运行）
 * @Version 1.0
 */
public class JavaVMStackOOM {

    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
