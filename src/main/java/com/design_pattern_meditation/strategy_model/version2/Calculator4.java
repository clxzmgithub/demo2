package com.design_pattern_meditation.strategy_model.version2;

/**
 * Created by xuzhongming on 2018/3/25.
 */
public enum Calculator4 {
    /**
     * 加法运算
     */
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    /**
     * 减法运算
     */
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator4(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * 声明y一个抽象函数
     */
    public abstract int exec(int a, int b);
}
