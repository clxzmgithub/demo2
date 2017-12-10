package com.crazyjava3.chapter6;

/**
 * TODO completion javadoc.
 *
 * @author xuzhongming
 * @since 06 八月 2017
 */
public class StringJoinTest {
    public static void main(String[] args){
        String s1="疯狂Java";
        String s2="疯狂"+"Java";
        System.out.println(s1==s2);//true
        String str1="疯狂";
        String str2="Java";
        String s3=str1+str2;
        System.out.println(s1==s3);
    }
}
