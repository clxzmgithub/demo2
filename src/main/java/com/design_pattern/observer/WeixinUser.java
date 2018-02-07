package com.design_pattern.observer;

/**
 * @author xuzhongming
 * @since 07 二月 2018
 * 具体观察者
 */
public class WeixinUser implements Observer {
    //微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        System.out.println(name + "_" + message);
    }
}
