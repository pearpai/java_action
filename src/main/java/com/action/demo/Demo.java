package com.action.demo;

import java.util.Scanner;

/**
 * 设计一个遥控机器人：
 * <p>
 * - 能在一个20x20的工作平台上进行作业。
 * <p>
 * - 能接收5个指令：前进F、后退B、左转L、右转R、工作W；前进、后退指令可指定前进或后退的步数。
 * <p>
 * - 当前进或后退的指令超出平台边缘，机器人会自动终止当前指令的执行。
 * <p>
 * - 指令输入可以是一个序列，比如：F5LF2W，B3RF4WLF2等
 * <p>
 * 请用你熟悉的编程语言设计实现以上逻辑。本题将考察候选人的实现思路、代码风格、代码规范等，请在这些方面进行综合考虑和答题。限时45分钟。
 */
public class Demo {

    public static void main(String[] args) {

//        - 指令输入可以是一个序列，比如：F5LF2W，B3RF4WLF2等

//        String cmds = "F5LF2W";
//        String cmds = "B5LF2W";
//        String cmds = "B3RF4WLF2";
//        String cmds = "F5LF2WB3RF4WLF2";
        System.out.println("请输入指令：");
        Scanner sc = new Scanner(System.in);

        String str = "";
        Robot robot = new Robot();

        while (true) {
            str = sc.next();
            str = str.toUpperCase();
            // TODO: 2020/6/15 添加校验
            robotMove(robot, str);
        }
    }

    public static void robotMove(Robot robot, String cmds) {
        for (int i = 0; i < cmds.length(); i++) {
            char c = cmds.charAt(i);
            try {
                robot.changeDirectionOrStep(c);

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage() + "i===" + i + "char is " + c);
                break;
            }
        }
        System.out.println("operation last is " + robot.getNowOperation() + "  x,y: " + robot.getX() + "  " + robot.getY() + " now direction is " + robot.getNowDirection());
    }

}
