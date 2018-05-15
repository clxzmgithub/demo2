package com.java8;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 11 八月 2017
 */
public class Test1 {

    public static void main(String[] args) {
//        String[] array = {"a", "b", "c"};
//        for(Integer i : Lists.newArrayList(1,2,3)){
//            Stream.of(array).map(item -> Strings.padEnd(item, i, '@')).forEach(System.out::println);
//        }
//        List<String> stringList = Lists.newArrayList();
//        stringList.get(0);


        Set<String> result = Sets.newHashSet();
        Set<String> set1 = Sets.newHashSet();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");

        Set<String> set2 = Sets.newHashSet();
        set2.add("e");
        set2.add("f");
        set2.add("g");
        set2.add("h");
        set1.retainAll(set2);


//        result.clear();
//        result.addAll(set1);
//        result.retainAll(set2);
        System.out.println(set1);

//        String a = "1";
//        int b = -Integer.parseInt(a);
//        System.out.println(b);
    }
}
