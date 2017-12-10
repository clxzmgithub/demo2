package com.multi_thread;

/**
 * @author xuzhongming
 * @since 17 九月 2017
 */
public class MyThreadTest{
    public static void main(String[] args){
        System.out.println("主线程 ID:"+Thread.currentThread().getId());

        MyThread myThread1=new MyThread("thread1");
        myThread1.start();

        MyThread myThread2=new MyThread("thread2");
        myThread2.run();

        MyThread myThread3=new MyThread("thread3");
        myThread3.start();
    }
}
class MyThread extends Thread{
    private static int num=0;
    private String name;

    public MyThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        System.out.println("name:"+name+" 子线程ID："+Thread.currentThread().getId());
    }
}
