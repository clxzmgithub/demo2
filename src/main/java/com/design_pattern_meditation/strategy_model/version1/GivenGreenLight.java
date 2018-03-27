package com.design_pattern_meditation.strategy_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太放绿灯,放行");
    }
}
