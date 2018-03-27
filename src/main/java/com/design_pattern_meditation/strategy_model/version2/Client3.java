package com.design_pattern_meditation.strategy_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Client3 {
    /**
     * 加号
     */
    private final static String ADD_SYMBOL = "+";
    /**
     * 减号
     */
    private final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = 1;
        String symbol = "+";
        int b = 2;
        Context3 context3 = null;
        if (symbol.equals(ADD_SYMBOL)) {
            context3 = new Context3(new Add3());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context3 = new Context3(new Sub3());
        }
        System.out.println("1+2=" + context3.exec(a, b));
    }
}
