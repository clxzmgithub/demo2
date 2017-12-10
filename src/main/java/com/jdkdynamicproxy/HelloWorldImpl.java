package com.jdkdynamicproxy;

/**
 * Created by xuzhongming on 2017/7/17.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld() {
        System.out.println("HelloWorld!");
    }
}
