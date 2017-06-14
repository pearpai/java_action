package com.action.design.pattern.prototype;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 创建一个实现了 Cloneable 接口的抽象类
 * Created by wuyunfeng on 2017/6/13.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Shape implements Cloneable, Serializable {

    private static final long serialVersionUID = -4905188583920166883L;
    private String id;
    private String type;

    abstract void draw();

    // throws 避免警告
    // 这个例子中没有不分浅复杂 还是 深复制  只有当 类中相关其他类的时候 如需深复制 这进行 相关类对象的clone
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (Exception ignore) {
            return null;
        }

    }
}
