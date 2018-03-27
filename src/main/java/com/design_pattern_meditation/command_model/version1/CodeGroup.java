package com.design_pattern_meditation.command_model.version1;

/**
 * 代码组
 *
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组......");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能......");
    }

    @Override
    public void delete() {
        System.out.println("客户要求减少一项功能......");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项功能......");
    }

    @Override
    public void plan() {
        System.out.println("客户要求代码变更计划......");
    }
}
