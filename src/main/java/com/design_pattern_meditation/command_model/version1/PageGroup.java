package com.design_pattern_meditation.command_model.version1;

/**
 * 美工组
 *
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组......");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一个页面......");
    }

    @Override
    public void delete() {
        System.out.println("客户要求减少一个页面......");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一个页面......");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划......");
    }
}
