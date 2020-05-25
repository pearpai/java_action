package com.action.shejizhichan.chapter08;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-24 8:24
 * @Version 1.0
 */
public class NvWa {

    public static void main(String[] args) {
        // 声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        // 女娲第一次造人，火候不足，于是白人产生
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--造出的第二批人是黑色人种--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--造出的第三批人是黄色人种--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
