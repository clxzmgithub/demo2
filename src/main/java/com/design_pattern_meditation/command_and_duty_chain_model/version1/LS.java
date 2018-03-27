package com.design_pattern_meditation.command_and_duty_chain_model.version1;

/**
 * @author xuzhongming
 * @since 26 三月 2018
 */
public class LS extends AbstractLS {

    /**
     * 参数为空
     *
     * @return
     */
    @Override
    protected String getOperatorParam() {
        return super.DEFAULT_PARAM;
    }

    /**
     * 最简单的ls命令
     *
     * @return
     */
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.getCommandName() + vo.getParam() + vo.getData());
    }
}
