package com.action.view.design.principle.openclose;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 20:45
 * @Version 1.0
 */
public class JavaDiscountCourse extends JavaCourse {


    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }


//    public Double getOriginPricePrice() {
//        return super.getPrice();
//    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
