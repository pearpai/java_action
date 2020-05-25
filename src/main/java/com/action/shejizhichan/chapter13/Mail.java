package com.action.shejizhichan.chapter13;

/**
 * @Description TODO
 * @Author wuyunfeng
 * @Date 2020-05-25 7:09
 * @Version 1.0
 */
public class Mail implements Cloneable {

    private String receiver;
    // 邮件名称
    private String subject;

    // 称谓
    private String appellation;

    private String contxt;

    // 邮件尾部，一般都是加上“XXX”等版权信息
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject =advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
