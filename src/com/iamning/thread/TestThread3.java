package com.iamning.thread;
//创建线程的方式2：实现runnable接口，重写run方法，执行线程需要的丢入runnable接口的实现类，调用start方法
public class TestThread3 implements Runnable{
//更推荐使用这个Runnable接口，因为接口可以多继承

    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在看代码--"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TestThread3 testThread3=new TestThread3();

        //创建线程对象，通过线程对象来开启我们的线程代理
//        Thread thread=new Thread(testThread3);
//
//        thread.start();
//
        new Thread(testThread3).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程--"+i);
        }
    }
}
