package com.java8.optional;

import java.util.Optional;

/**
 * @author xuzhongming
 * @since 02 十一月 2017
 */
public class Test1 {
    public static void main(String[] args){
        Optional<String> someNull=Optional.of("");//Exception in thread "main" java.lang.NullPointerException
        //throw new RuntimeException();
        f1();
    }
    private static void f1(){
        throw new RuntimeException();
    }
}
