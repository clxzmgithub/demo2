package com.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xuzhongming on 2017/7/18.
 */
public class CglibProxy1 implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理：订去程机票");
        System.out.println("Cglib代理：订成都酒店");
        Object result=methodProxy.invokeSuper(o,objects);
        System.out.println(result.toString());
        System.out.println("Cglib代理：订回程机票");
        System.out.println("Cglib代理：报销");
        return "Cglib代理：出差完毕";
    }
}
