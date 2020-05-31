package com.action.shejizhichan.chapter22;

public class Spy extends Thread {

    private HanFeiZi hanFeiZi;
    private LiSi liSi;

    private String type;

    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println("=======================");
        while (true) {
//            System.out.println("=======================");
            if (this.type.equals("breakfast")) {
//                this.hanFeiZi.setHavingBreakfast(true);
                if (this.hanFeiZi.isHavingBreakfast()) {
                    this.liSi.update("韩非子在吃饭");
                    this.hanFeiZi.setHavingBreakfast(false);
                }
            } else {
//                this.hanFeiZi.setHavingFun(true);
                if (this.hanFeiZi.isHavingFun()) {
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }
}
