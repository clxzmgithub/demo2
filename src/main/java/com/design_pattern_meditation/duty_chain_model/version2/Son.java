package com.design_pattern_meditation.duty_chain_model.version2;

import com.design_pattern_meditation.duty_chain_model.version1.IWomen;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Son extends Handler {
    /**
     * 每个类都要说明自己能处理哪些请求
     *
     * @param
     */
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---母亲向儿子请示---");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
