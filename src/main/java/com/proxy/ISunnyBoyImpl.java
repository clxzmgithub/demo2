package com.proxy;

/**
 * Created by xuzhongming on 2017/7/14.
 */
public class ISunnyBoyImpl implements ISunnyBoy {
    @Override
    public String ecode() {
        System.out.println("努力编码。。。");
        return "编码完成";
    }
}
