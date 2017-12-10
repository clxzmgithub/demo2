package com.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xuzhongming on 2017/7/17.
 */
public class CglibProxy implements MethodInterceptor{

    private Enhancer enhancer=new Enhancer();

    public Object getProxy(Class clazz){
        //设置需要创建的子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类的实例
        return enhancer.create();
    }

    //实现MethodInterceptor接口方法
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable{
        System.out.println("前置代理");
        //通过代理类调用福剋的
        Object result=proxy.invokeSuper(obj,args);
        System.out.println("后置代理");
        return result;
    }
}
