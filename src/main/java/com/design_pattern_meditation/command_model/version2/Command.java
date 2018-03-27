package com.design_pattern_meditation.command_model.version2;

import com.design_pattern_meditation.command_model.version1.CodeGroup;
import com.design_pattern_meditation.command_model.version1.PageGroup;
import com.design_pattern_meditation.command_model.version1.RequirementGroup;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public abstract class Command {
    /**
     * 需求组
     */
    protected RequirementGroup rg = new RequirementGroup();
    /**
     * 美工组
     */
    protected PageGroup pg = new PageGroup();
    /**
     * 代码组
     */
    protected CodeGroup cg = new CodeGroup();

    /**
     * 只有一个方法，你要我做什么事情
     */
    public abstract void execute();
}
