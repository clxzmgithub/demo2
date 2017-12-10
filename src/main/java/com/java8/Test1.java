package com.java8;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import java.util.stream.Stream;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 11 八月 2017
 */
public class Test1 {

    public static void main(String[] args){
        String[] array = {"a", "b", "c"};
        for(Integer i : Lists.newArrayList(1,2,3)){
            Stream.of(array).map(item -> Strings.padEnd(item, i, '@')).forEach(System.out::println);
        }
    }
}
