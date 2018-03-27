package com.design_pattern_meditation.command_and_duty_chain_model.version1;

import java.util.List;

/**
 * @author xuzhongming
 * @since 26 三月 2018
 */
public abstract class Command {
    /**
     * 命令的执行方法
     *
     * @param vo
     * @return
     */
    public abstract String execute(CommandVO vo);

    /**
     * 建立链表
     */
    protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {


        return null;
    }
}

