package com.action.shejizhichan.chapter19;


import java.util.Map;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-28 9:17
 * @Version 1.0
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map baseInfo = (Map) super.getUserBaseInfo();
    private Map homeInfo = (Map) super.getUserHomeInfo();
    private Map officeInfo = (Map) super.getUserOfficeInfo();


    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
