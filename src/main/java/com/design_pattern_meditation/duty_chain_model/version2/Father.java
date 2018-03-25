package com.design_pattern_meditation.duty_chain_model.version2;

import com.design_pattern_meditation.duty_chain_model.version1.IWomen;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Father extends Handler {
    /**
     * 每个类都要说明自己能处理哪些请求
     *
     * @param
     */
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("---女儿向父亲请示---");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
