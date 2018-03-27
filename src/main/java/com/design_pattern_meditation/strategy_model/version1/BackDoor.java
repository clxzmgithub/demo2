package com.design_pattern_meditation.strategy_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙,让吴国太给孙权施加压力");
    }
}
