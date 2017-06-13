package com.action.design.pattern.builder;

/**
 * Created by wuyunfeng on 2017/6/13.
 */
public class BuiderPatternDemo {

    public static void main(String[] args) {
        // 获取套餐生成对象
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println();
        System.out.println("Total Cost: " + vegMeal.getCost());


        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());

    }

}
