package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by xuzhongming on 2017/7/14.
 */
public class Test2 {
    public static void main(String[] args){
        ISunnyBoy target=new ISunnyBoyImpl();
        InvocationHandler invocationHandler=new PublicProxy(target);
        ISunnyBoy proxy= (ISunnyBoy)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),invocationHandler);
        System.out.println(proxy.ecode());
    }
}
