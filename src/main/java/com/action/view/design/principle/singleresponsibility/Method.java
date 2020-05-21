package com.action.view.design.principle.singleresponsibility;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-21 22:09
 * @Version 1.0
 */
public class Method {

    private void updateUserInfo(String userName, String address) {

        userName = "geely";
        address = "beijing";

    }

    private void updateUserInfo(String userName, String... properties) {

        userName = "geely";
//        address = "beijing";

    }

    private void updateUserName(String userName) {

        userName = "geely";

    }

    private void updateUserAddress(String address) {

        address = "beijing";

    }

    private void updateUserInfo(String userName, String address, boolean bool) {

        if (bool){
            // TODO: 2020-05-21  something1
        }else {
            // TODO: 2020-05-21  something2
        }
        userName = "geely";
        address = "beijing";

    }


}
