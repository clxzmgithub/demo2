package com.design_pattern_meditation.duty_chain_model.version1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xuzhongming
 * @since 19 三月 2018
 */
public class Client {
    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> iWomenArrayList = Lists.newArrayList();
        for (int i = 0; i < 5; i++) {
            iWomenArrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women : iWomenArrayList) {
            if (women.getType() == 1) {
                //未婚少女，请示父亲
                System.out.println("\n---女儿向父亲请示---");
                father.handleMessage(women);
            } else if (women.getType() == 2) {
                //已婚，请示丈夫
                System.out.println("\n---妻子向丈夫请示---");
                husband.handleMessage(women);
            } else if (women.getType() == 3) {
                //丈夫死，请示儿子
                System.out.println("\n---母亲向儿子请示---");
                son.handleMessage(women);
            } else {
                //暂时啥都不做
            }
        }
    }
}
