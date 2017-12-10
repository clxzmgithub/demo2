package com.reflect;

/**
 * Created by xuzhongming on 2017/7/16.
 */
public class ClassDemo1 {
    public static void main(String[] args){

        //Foo的实例对象如何表示呢？foo1 就是实力对象
        Foo foo1=new Foo();
        //任何一个类都是Class的实力对象，这个Class的实力对象有三种表示方式

        //第一种表达方式，已知类名，任何一个类都有一个隐含的成员变量class
        Class c1=Foo.class;

        //第二种表达方式，已知该类的对象，通过getClass方法
        Class c2=foo1.getClass();


        System.out.println(c1==c2);
        //第三种表示方式Class.forName("com.reflect.Foo");
        Class c3=null;
        try {
            c3 = Class.forName("com.reflect.Foo");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(c2==c3);

        try {
            Foo foo=(Foo)c1.newInstance();//需要强制转换
            foo.print();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
