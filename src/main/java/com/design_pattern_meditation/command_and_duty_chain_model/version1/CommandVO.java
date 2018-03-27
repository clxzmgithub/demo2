package com.design_pattern_meditation.command_and_duty_chain_model.version1;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author xuzhongming
 * @since 25 三月 2018
 */
public class CommandVO {
    /**
     * 定义参数名与参数的分隔符，一般是空格
     */
    public final static String DIVIDE_FLAG = " ";

    /**
     * 定义参数前的符号,linux or unix一般是-
     */
    public final static String PREFIX = "-";
    /**
     * 命令名,如ls,du
     */
    private String commandName = "";

    /**
     * 参数列表
     */
    private ArrayList<String> paramList = Lists.newArrayList();
    /**
     * 操作数列表
     */
    private ArrayList<String> dataList = Lists.newArrayList();

    /**
     * 通过构造函数传递进来命令
     *
     * @param commandStr
     */
    public CommandVO(String commandStr) {
        //常规判断
        if (commandStr != null && commandStr.length() != 0) {
            String[] complexStr = commandStr.split(DIVIDE_FLAG);
            this.commandName = complexStr[0];
            //把参数放到list中
            for (int i = 1; i < complexStr.length; i++) {
                String str = complexStr[i];
                //包含前缀符号，认为是参数
                if (str.indexOf(CommandVO.PREFIX) == 0) {
                    this.paramList.add(str.replace(CommandVO.PREFIX, " ").trim());
                } else {
                    this.dataList.add(str.trim());
                }
            }
        } else {
            //传递的命令错误
            System.out.println("命令解析失败，必须传递一个正确的命令才能正确执行");
        }
    }

    /**
     * 得到命令名
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * 获得参数
     */
    public ArrayList<String> getParam() {
        //为了方便处理空参数
        if (this.paramList.size() == 0) {
            this.paramList.add("");
        }
        return new ArrayList<>(new HashSet<>(this.paramList));
    }

    /**
     * 获得操作数
     */
    public ArrayList<String> getData() {
        return this.dataList;
    }
}














