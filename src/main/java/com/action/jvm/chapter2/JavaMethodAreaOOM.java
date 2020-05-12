package com.action.jvm.chapter2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Summary: 借助CGLib使得方法区出现内存溢出异常
 * VM Args:-XX:PermSize=10M -XX:MaxPermSize=10M
 * JDK 7 有效
 * JDK 8 无效： -XX:MaxMetaspaceSize:设置元空间最大值，默认是-1，即不限制，或者说只受限于本地内存 大小。
 * ·-XX:MetaspaceSize:指定元空间的初始空间大小，以字节为单位，达到该值就会触发垃圾收集 进行类型卸载，
 * 同时收集器会对该值进行调整:如果释放了大量的空间，就适当降低该值;如果释放 了很少的空间，那么在不超过-XX:MaxMetaspaceSize(如果设置了的话)的情况下，
 * 适当提高该值。
 * @author wuyunfeng
 * @date 12. 5月 2020 8:32 上午
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();

            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(objects, args);
                }
            });


        }
    }

    static class OOMObject {
    }
}
