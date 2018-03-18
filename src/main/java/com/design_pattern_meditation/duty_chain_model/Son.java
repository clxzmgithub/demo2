package com.design_pattern_meditation.duty_chain_model;

/**
 * @author xuzhongming
 * @since 19 三月 2018
 */
public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen iWomen) {
        System.out.println("母亲的请示是：" + iWomen.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
