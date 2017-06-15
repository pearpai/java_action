package com.action.design.pattern.iterator;

/**
 * 创建实现了Container接口的实体类。该类有实现了Iteror接口的内部类NameIterator
 * Created by wuyunfeng on 2017/6/15.
 */
public class NameRepository implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }

}
