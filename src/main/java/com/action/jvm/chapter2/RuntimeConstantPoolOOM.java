package com.action.jvm.chapter2;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description TODO
 * VM Args：-XX:PermSize=6M -XX:MaxPermSize=6M jdk6 异常
 * VM Args：-Xms20m -Xmx20m jdk7 以后 异常
 * 原本存放在永久代的字符串常量池被移至Java堆之中
 * @Author wuyunfeng
 * @Date 2020-05-11 23:02
 * @Version 1.0
 */
@Slf4j
public class RuntimeConstantPoolOOM {


    public static void main(String[] args) {
        // 使用Set保持着常量池引用，避免Full GC回收常量池行为
        List<String> set = new ArrayList<>();
        // 在short范围内足以让6MB的PermSize产生OOM了
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
            log.info("{}", set.size());
        }
    }

//    public static void main(String[] args) {
//
//
//        Set<String> set = new HashSet<>();
//        short i = 0;
//        while (true) {
//            set.add(String.valueOf(i++).intern());
//            log.info("{}", set.size());
//        }
//    }

}
