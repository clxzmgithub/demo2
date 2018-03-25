package com.design_pattern_meditation.duty_chain_model.version2;

import com.design_pattern_meditation.duty_chain_model.version1.IWomen;

/**
 * @author xuzhongming
 * @since 19 三月 2018
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;


    /**
     * 能处理的级别
     */
    private int level = 0;

    /**
     * 责任传递，下一个责任人是谁
     */
    private Handler nextHandler;

    /**
     * 每个类都要说明自己能处理哪些请求
     *
     * @param _level
     */
    public Handler(int _level) {
        this.level = _level;
    }

    /**
     * 一个女性（女儿，妻子或母亲）要求逛街，你要处理这个请求
     *
     * @param women
     */
    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("---没地方请示了，当作不同意处理---\n");
            }
        }
    }

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了
     */
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    /**
     * 有请示要回应
     */
    protected abstract void response(IWomen women);

}
