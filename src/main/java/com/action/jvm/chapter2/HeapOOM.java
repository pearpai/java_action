package com.action.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Summary:
 * VM Args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * -XX:+HeapDumpOnOutOf-MemoryError可以让虚拟机在出现内存溢出异常的时候Dump出当前的内存堆转储快照以便进行事后分析
 * @author wuyunfeng
 * @date 11. 5月 2020 5:19 下午
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true){
            list.add(new OOMObject());
        }

    }

}
