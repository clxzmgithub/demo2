package com.design_pattern_meditation.command_and_duty_chain_model.version1;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * @author xuzhongming
 * @since 26 三月 2018
 * <p>
 * 根据父类获得子类
 */
public class Test {

    public static void main(String[] args) {
//        BigDecimal bigDecimal = new BigDecimal(0.95);
//        int a = bigDecimal.intValue();
//        System.out.println(a);
//        double a = 32.44 / 35.24;
//        System.out.println(a);
//        double a = 7;
//        double b = 6;
//        String str = "" + a - b + "";
//        System.out.println("aaaa" + (a - b) + "bbbb");

//        List<String> stringList = Lists.newArrayList();
//        stringList.add("aaa");
//        stringList.add("bbb");
//        stringList.add("ccc");
//        stringList.add("ddd");
//
//        System.out.println(stringList.toString());

        Set<Student> set = Sets.newTreeSet();
        Student s3 = new Student(3);
        Student s4 = new Student(4);
        Student s5 = new Student(5);
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        List<Student> list = Lists.newArrayList();
        list.add(s4);
        list.add(s3);
        list.add(s5);
        list.add(s1);
        list.add(s2);

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge() < 0 ? 1 : -1;
            }
        });
        System.out.println(list);

//        s1.toString();
//        set.add(s3);
//        set.add(s4);
//        set.add(s5);
//        set.add(s1);
//        set.add(s2);
//        System.out.println(set);
//        for (Student s : set) {
//            System.out.println(s);
//        }


    }
}

class Student implements Comparable<Student> {
    public Student(int age) {
        this.age = age;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return this.age + "";
    }
}
