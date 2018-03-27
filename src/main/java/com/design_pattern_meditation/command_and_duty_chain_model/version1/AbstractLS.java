package com.design_pattern_meditation.command_and_duty_chain_model.version1;

/**
 * @author xuzhongming
 * @since 26 三月 2018
 * <p>
 * ls命令
 */
public abstract class AbstractLS extends CommandName {

    /**
     * 默认参数
     */
    public final static String DEFAULT_PARAM = "";
    /**
     * 参数a
     */
    public final static String A_PARAM = "a";
    /**
     * 参数l
     */
    public final static String L_PARAM = "l";
}
