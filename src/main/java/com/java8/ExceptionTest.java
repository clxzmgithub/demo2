package com.java8;

import java.time.format.DateTimeFormatter;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 11 八月 2017
 */
public class ExceptionTest {
    public static void main(String[] args) {
//        String s = "abc";
//        Double.parseDouble(s);
//
//        Map<String, String> m1 = Maps.newHashMap();
//        m1.put("1", "a");
//        m1.put("2", "a");
//        m1.put("3", "a");
//        m1.put("4", "a");
//        System.out.println(m1);
//
//        Map<String, String> m2 = Maps.newHashMap();
//        m2.put("1", "b");
//        m2.put("2", "b");
//        m2.put("3", "b");
//        m2.put("4", "b");
//
//        m1.putAll(m2);
//        System.out.println(m1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateUtil.YYYY_MM_DD);
        String saleDate = formatter.format(DateUtil.toLocalDate("20180505", DateUtil.YYYYMMDD));
        System.out.println(saleDate);
    }
}
