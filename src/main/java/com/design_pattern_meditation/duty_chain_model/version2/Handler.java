package com.design_pattern_meditation.duty_chain_model.version2;

/**
 * @author xuzhongming
 * @since 19 三月 2018
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;

    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;

    //每个类都要说明自己能处理哪些请求
    public Handler(int _level) {
        this.level = _level;
    }
    
}
