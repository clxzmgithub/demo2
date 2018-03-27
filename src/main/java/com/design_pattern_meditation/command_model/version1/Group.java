package com.design_pattern_meditation.command_model.version1;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public abstract class Group {
    /**
     * 甲乙双方分开开会，如果你要和某个组开会，你要能找到该组
     */
    public abstract void find();

    /**
     * 被要求增加功能
     */
    public abstract void add();

    /**
     * 被要求删除功能
     */
    public abstract void delete();

    /**
     * 被要求修改功能
     */
    public abstract void change();

    /**
     * 被要求所有的变更计划
     */
    public abstract void plan();

}
