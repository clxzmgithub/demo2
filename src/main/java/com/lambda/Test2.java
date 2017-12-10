package com.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author xuzhongming
 * @since 19 九月 2017
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

//        System.out.println("Languages which starts with J :");
//        filter(languages,(str)->str.startsWith("J"));
//
//        System.out.println("Languages which ends with a ");
//        filter(languages, (str)->str.endsWith("a"));
//
//        System.out.println("Print all languages :");
//        filter(languages, (str)->true);
//
//        System.out.println("Print no language : ");
//        filter(languages, (str)->false);
//
//        System.out.println("Print language whose length greater than 4:");
//        filter(languages, (str)->str.length() > 4);

        // We can even combine Predicate using and(), or() And xor() logical functions
        // for example to find names, which starts with J and four letters long, you
        // can pass combination of two Predicate
//        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
//        Predicate<String> fourLetterLongs = (n) -> n.length() == 4;
//        languages.stream().filter(startsWithJ.and(fourLetterLongs))
//                .forEach((n) -> System.out.println(
//                        "which starts with'J' and four letter long is :" + n));



        // Create a List with String more than 2 characters
//        List<String> filtered = languages.stream().filter(x -> x.length()> 4)
//                .collect(Collectors.toList());
//        System.out.printf("Original List : %s, filtered list : %s %n",
//                languages, filtered);



        //计算List中的元素的最大值，最小值，总和及平均值
        // Get count, min, max, sum, and average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());
    }

    /*public static void filter(List<String> names, Predicate condition) {
        for(String name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }*/

    //Even better
    public static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name)))
                .forEach((name) -> {
                    System.out.println(name + " ");
                });
    }


}
