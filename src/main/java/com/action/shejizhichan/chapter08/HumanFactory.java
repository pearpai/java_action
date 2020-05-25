package com.action.shejizhichan.chapter08;

/**
 * @Description 简单工厂模式中的工厂类为 不继承抽象工厂，而是直接定义工厂方法 static createHuman
 * @Author wuyunfeng
 * @Date 2020-05-24 8:18
 * @Version 1.0
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        // 定义一个生产的人种
        Human human = null;
        try {
            // 产生一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }

        return (T) human;
    }
}
