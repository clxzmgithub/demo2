package com.design_pattern_meditation.command_model.version2;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class Client {
    public static void main(String[] args) {
        //定义客户对接人
        Invoker xiaosan = new Invoker();
        System.out.println("------客户要求增加一项需求------");
        //客户给我们下命令来了
        Command command = new AddRequirementCommand();
        //客户接到命令
        xiaosan.setCommand(command);
        //接头人执行命令
        xiaosan.action();
    }
}
