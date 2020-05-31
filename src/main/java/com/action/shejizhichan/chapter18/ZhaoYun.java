package com.action.shejizhichan.chapter18;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 22:53
 * @Version 1.0
 */
public class ZhaoYun {

    // 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
    public static void main(String[] args) {
        Context context;
        // 刚刚到吴国都时候拆第一个
        System.out.println("-----刚刚到吴国都时候拆第一个-----");
        context = new Context(new BackDoor()); // 那到妙计
        context.operate();
        System.out.println("\n\n\n\n");
        // 刘备乐不思蜀了，拆第二个
        System.out.println("-----刘备乐不思蜀了，拆第二个-----");
        context = new Context(new GiveGreenLight()); // 那到妙计
        context.operate();
        System.out.println("\n\n\n\n");

        // 孙权都小兵追来了，咋办？拆第三个
        System.out.println("-----孙权都小兵追来了，咋办？拆第三个-----");
        context = new Context(new BlockEnemy()); // 那到妙计
        context.operate();
        System.out.println("\n\n\n\n");

    }

}
