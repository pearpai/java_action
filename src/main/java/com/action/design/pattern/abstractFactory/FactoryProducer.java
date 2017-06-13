package com.action.design.pattern.abstractFactory;

/**
 * 创建一个工厂创造器/生成类，通过穿的形状或颜色来获取工厂。
 * Created by wuyunfeng on 2017/6/13.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }

}
