package com.design_pattern_meditation.strategy_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住救兵");
    }
}
