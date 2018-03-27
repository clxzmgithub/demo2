package com.design_pattern_meditation.strategy_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Context3 {
    private Calculator3 cal = null;

    public Context3(Calculator3 _cal) {
        this.cal = _cal;
    }

    public int exec(int a, int b) {
        return this.cal.exec(a, b);
    }
}
