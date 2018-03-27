package com.design_pattern_meditation.strategy_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Calculator1 {

    /**
     * 加号
     */
    private final static String ADD_SYMBOL = "+";
    /**
     * 减号
     */
    private final static String SUB_SYMBOL = "-";

    /**
     * @return
     */
    public int exec(int a, int b, String symbol) {
        int result = 0;
        if (ADD_SYMBOL.equals(symbol)) {
            result = add(a, b);
        } else if (SUB_SYMBOL.equals(symbol)) {
            result = sub(a, b);
        }
        return result;
    }

    /**
     * 加法运算
     */
    private int add(int a, int b) {
        return a + b;
    }

    /**
     * 减法运算
     */
    private int sub(int a, int b) {
        return a - b;
    }
}
