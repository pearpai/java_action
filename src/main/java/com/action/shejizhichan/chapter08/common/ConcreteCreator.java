package com.action.shejizhichan.chapter08.common;

/**
 * @Description 抽象工厂类
 * @Author wuyunfeng
 * @Date 2020-05-24 8:34
 * @Version 1.0
 */
public class ConcreteCreator extends Creator {

    /**
     * 创建一个产品对象，其收入的参数类型可以自行设置
     * 通常为String、Enum、class等，当然也可以为空
     */
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T) product;
    }


}
