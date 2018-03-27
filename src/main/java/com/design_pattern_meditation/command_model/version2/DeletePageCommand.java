package com.design_pattern_meditation.command_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class DeletePageCommand extends Command {
    /**
     * 执行删除一个页面的命令
     */
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
