package com.design_pattern_meditation.duty_chain_model;

/**
 * Created by xuzhongming on 2018/3/19.
 */
public interface IHandler {

    /**
     * 一个女性（女儿，妻子，母亲）要求逛街，你要处理这个请求
     *
     * @param iWomen
     */
    public void handleMessage(IWomen iWomen);
}
