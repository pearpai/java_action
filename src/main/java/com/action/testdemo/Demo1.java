package com.action.testdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Summary:
 * Created by wuyunfeng on 19. 5月 2020 8:09 上午.
 */
public class Demo1 {

    public static void main(String[] args) {
        String str = "北京市(朝阳区)(西城区)(海淀区)";
        Pattern p =Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if (m.find()) {
            System.out.println(m.group());
        }
    }

}
