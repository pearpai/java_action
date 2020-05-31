package com.action.shejizhichan.chapter18;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 22:49
 * @Version 1.0
 */
public class GiveGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
