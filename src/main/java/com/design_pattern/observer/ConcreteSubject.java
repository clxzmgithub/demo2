package com.design_pattern.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author xuzhongming
 * @since 07 二月 2018
 * 具体被观察者
 */
public class ConcreteSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserList = Lists.newArrayList();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}
