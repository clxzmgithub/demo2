package com.crazyjava3.chapter6;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 06 八月 2017
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args){
        //直接把一个基本类型的变量赋给Integer对象
        Integer inObj=5;
        Object boolObj=true;
        int it=inObj;
        if(boolObj instanceof Boolean){
            boolean b=(Boolean) boolObj;
            System.out.println(b);
        }

    }
}
