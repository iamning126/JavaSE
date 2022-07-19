package com.iamning.thread;
//测试Join方法想象成插队
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("百度网盘会员ViP" + i);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        //启动我的线程
        TestJoin testJoin=new TestJoin();
        Thread thread=new Thread(testJoin);
        thread.start();
        //主线程
        for (int i = 0; i < 1000; i++) {
            if(i==200){
                    thread.join();
            }
            System.out.println("限速中，你个普通用户"+i);
        }
    }
}
