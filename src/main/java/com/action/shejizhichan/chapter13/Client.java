package com.action.shejizhichan.chapter13;

import java.util.Random;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:13
 * @Version 1.0
 */
public class Client {

    // 发送账单数量，这个值是从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 把模板定义出来，这个是冲数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX银行版权所有");
        while (i < MAX_COUNT) {
            // 一下是没封邮件不同的地方
            Mail cloneMail = mail.clone();
            mail.setAppellation(getRandString(5) + " 先生（女生）");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            // 然后发送邮件
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题： " + mail.getSubject() + "\t收件人： " + mail.getReceiver() + "\t...发送成功");
    }

    // 获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

}
