package com.design_pattern_meditation.duty_chain_model.version1;

/**
 * @author xuzhongming
 * @since 19 三月 2018
 */
public class Father implements IHandler {
    @Override
    public void handleMessage(IWomen iWomen) {
        System.out.println("女儿的请示是：" + iWomen.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
