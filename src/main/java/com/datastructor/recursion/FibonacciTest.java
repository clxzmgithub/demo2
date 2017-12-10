package com.datastructor.recursion;

/**
 * @author xuzhongming
 * @since 23 十一月 2017
 */
public class FibonacciTest {
    public static void main(String[] args) {

        long result = factorial2(6);
        System.out.println(result);
    }

    public static long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException();

        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static long factorial2(int n) {
        long result = 1;
        for (int i = n; i > 0 && i <= n; i--) {
            result *= i;
        }
        return result;
    }
}
