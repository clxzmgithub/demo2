package com.design_pattern_meditation.duty_chain_model;

/**
 * @author xuzhongming
 * @since 19 三月 2018
 */
public class Husband implements IHandler {
    @Override
    public void handleMessage(IWomen iWomen) {
        System.out.println("妻子的请示是：" + iWomen.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
