package com.proxy;

/**
 * Created by xuzhongming on 2017/7/14.
 */
public class Test1 {
    public static void main(String[] args){
        ISunnyBoy target=new ISunnyBoyImpl();
        ISunnyBoyImplProxy proxy=new ISunnyBoyImplProxy(target);
        System.out.println(proxy.ecode());

    }
}
