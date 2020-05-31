package com.action.shejizhichan.chapter19;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-28 9:12
 * @Version 1.0
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("homeTelNumber", "");
        map.put("userName", "这个员工叫混世魔王");
        map.put("mobileNumber", "这个员工电话是");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("jobPosition", "这个职位是BOSS...");
        map.put("officeTelNumber", "员工的办公电话是");

        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("homeTelNumber", "员工的家庭电话是...");
        map.put("homeAddress", "员工的家庭地址是...");
        return map;
    }
}
