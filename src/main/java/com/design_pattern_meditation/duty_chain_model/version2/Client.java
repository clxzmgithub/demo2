package com.design_pattern_meditation.duty_chain_model.version2;

import com.design_pattern_meditation.duty_chain_model.version1.IWomen;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> iWomenArrayList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            iWomenArrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : iWomenArrayList) {
            father.handleMessage(women);
        }
    }
}
