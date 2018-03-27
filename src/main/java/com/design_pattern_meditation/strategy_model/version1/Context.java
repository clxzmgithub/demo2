package com.design_pattern_meditation.strategy_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Context {
    /**
     * 妙计
     */
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 使用计谋，开始出招了
     */
    public void operate() {
        this.strategy.operate();
    }
}
