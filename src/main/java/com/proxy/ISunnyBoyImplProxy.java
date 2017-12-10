package com.proxy;

/**
 * Created by xuzhongming on 2017/7/14.
 */
public class ISunnyBoyImplProxy implements ISunnyBoy {
    private ISunnyBoy target;

    public ISunnyBoyImplProxy(ISunnyBoy target){
        super();
        this.target=target;
    }
    @Override
    public String ecode() {
        System.out.println("订去程机票");
        System.out.println("订成都机票");
        System.out.println(target.ecode());
        System.out.println("订回程机票");
        System.out.println("报销");
        return "出差完毕";
    }
}
