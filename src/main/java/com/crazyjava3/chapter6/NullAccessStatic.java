package com.crazyjava3.chapter6;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 06 八月 2017
 */
public class NullAccessStatic {
    private static void test(){
        System.out.println("xzm");
    }
    public static void main(String[] args){
        NullAccessStatic nas=null;
        nas.test();
    }
}
