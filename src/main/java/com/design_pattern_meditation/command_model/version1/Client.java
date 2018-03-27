package com.design_pattern_meditation.command_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Client {
    public static void main(String[] args) {
        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("------客户要求增加一项需求------");
        Group group = new RequirementGroup();

        group.find();//找到需求组

        group.add();//增加一项需求

        group.plan();//需求变更计划

//        ArrayList<String> strings = Lists.newArrayList();
//        strings.add("");
//        System.out.println(strings.size());
    }
}
