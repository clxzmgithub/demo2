package com.design_pattern_meditation.strategy_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Calculator2 {

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
        return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
    }

}
