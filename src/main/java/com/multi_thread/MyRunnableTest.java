package com.multi_thread;

/**
 * @author xuzhongming
 * @since 17 九月 2017
 */
public class MyRunnableTest {
    public static void main(String[] args){
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        thread.start();
    }
}

class MyRunnable implements Runnable{
    public MyRunnable(){
    }
    @Override
    public void run() {
        System.out.println("子线程ID:"+Thread.currentThread().getId());
    }
}
