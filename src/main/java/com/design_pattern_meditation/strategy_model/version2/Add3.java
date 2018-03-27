package com.design_pattern_meditation.strategy_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Add3 implements Calculator3 {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
