package com.java8.generics;

/**
 * @author xuzhongming
 * @since 02 十一月 2017
 */
public class GenericTest {
    public static void main(String[] args) {
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);
    }

    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }

    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data :" + data.getData());
    }
}

class Box<T> {
    private T data;

    public Box() {

    }

    public Box(T data) {
        setData(data);
    }

    /*public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }*/

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
