package com.design_pattern.observer;

/**
 * @author xuzhongming
 * @since 07 二月 2018
 * 客户端调用
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //创建微信用户
        WeixinUser user1 = new WeixinUser("杨影枫");
        WeixinUser user2 = new WeixinUser("月眉儿");
        WeixinUser user3 = new WeixinUser("紫轩");
        //订阅公众号
        concreteSubject.attach(user1);
        concreteSubject.attach(user2);
        concreteSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        concreteSubject.notify("刘皇叔的专栏更新了");
    }
}
