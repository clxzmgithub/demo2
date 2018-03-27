package com.design_pattern_meditation.command_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class AddRequirementCommand extends Command {
    /**
     * 执行增加一项需求的命令
     */
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
