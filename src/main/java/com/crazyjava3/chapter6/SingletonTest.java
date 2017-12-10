package com.crazyjava3.chapter6;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 06 八月 2017
 */
public class SingletonTest {
    public static void main(String[] args){
        Singleton s1= Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        System.out.println(s1==s2);
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
