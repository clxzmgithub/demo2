package com.design_pattern_meditation.command_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Invoker {
    /**
     * 什么命令
     */
    private Command command;

    /**
     * 客户发出命令
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action() {
        this.command.execute();
    }
}
