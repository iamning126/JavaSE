package com.iamning.thread;
//多个线程同时操作同一个对象
//买火车票的例子


//发现问题：多个线程操作同一份资源的情况下，线程不安全，数据紊乱。
public class TestThread4 implements Runnable{

    //票数
    private int ticketNums=100;


    @Override
    public void run() {
        while (true){
            if (ticketNums <=0) {
                break;
            }
//            模拟延时
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        TestThread4 ticket=new TestThread4();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"黄牛党").start();
    }
}