package com.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author xuzhongming
 * @since 18 九月 2017
 */
public class Test1 {
    public static void main(String[] args) {
        //不使用lambda
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer integer : costBeforeTax) {
            double price = integer + .12 * integer;
            System.out.println(price);
        }

        //使用lambda   map
        List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax1.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);

        //使用lambda   reduce
        List<Integer> costBeforeTax2 = Arrays.asList(100, 200, 300, 400, 500);
        Double bill=costBeforeTax2.stream().
                map((cost) -> cost + .12 * cost).
                reduce((sum, cost) -> sum + cost).
                get();
        System.out.println("Total:"+bill);


        //使用lambda  启动线程
        new Thread( () -> System.out.println("In Java8!") ).start();

        //使用Lambda表达式遍历List集合
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
                "Date and Time API");
        features.forEach(n -> System.out.println(n));
        //方法引用是使用两个冒号::这个操作符号
        features.forEach(System.out::println);

    }
}
