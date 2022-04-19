package com.company.thread;
//模拟网络延时：放大问题的发生性

/**比如100张票，有可能发生
 * 有一个线程抢到低于0时没来得及判断停止线程的问题
 * 这也是抢票有时候，抢到第-1张票的原因
 */
public class TestSleep implements Runnable {
    //票数
    private int ticketNums = 100;
    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
//            模拟延时
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
        }
    }
    public static void main(String[] args) {
        TestThread4 ticket=new TestThread4();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小红").start();
        new Thread(ticket,"黄牛党").start();
    }
}
