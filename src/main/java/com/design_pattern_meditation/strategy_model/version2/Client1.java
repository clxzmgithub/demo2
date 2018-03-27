package com.design_pattern_meditation.strategy_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Client1 {
    public static void main(String[] args) {
        int a = 1;
        String symbol = "+";
        int b = 2;
        System.out.println("1+2=" + new Calculator1().exec(1, b, symbol));
    }
}
