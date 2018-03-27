package com.design_pattern_meditation.command_model.version1;

/**
 * 需求组
 *
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组......");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项需求......");
    }

    @Override
    public void delete() {
        System.out.println("客户要求减少一项需求......");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项需求......");
    }

    @Override
    public void plan() {
        System.out.println("客户要求需求变更计划......");
    }
}
