package com.action.design.pattern.builder;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class MealBuilder {


    /**
     * 套餐 1
     * 在套餐1
     * @return Meal
     */
    public Meal prepareVegMeal(){
        // 生成套餐信息 类 同事向
        Meal meal = new Meal();
        // 套餐信息类中添加 相关单品  VegBurger   Coke  通过两次继承item 对信息修细节统一 分化
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }


    /**
     * 套餐 2
     * @return Meal
     */
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
