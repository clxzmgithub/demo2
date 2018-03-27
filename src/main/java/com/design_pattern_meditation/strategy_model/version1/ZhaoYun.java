package com.design_pattern_meditation.strategy_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国，拆第一个
        System.out.println("---刚刚到吴国拆第一个---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n");

        //刘备乐不思蜀了，拆第二个
        System.out.println("---刘备乐不思蜀了，拆第二个---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n");

        //孙权的小兵追了，咋办，拆第三个
        System.out.println("---孙权的小兵追了，咋办，拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n");

    }
}
