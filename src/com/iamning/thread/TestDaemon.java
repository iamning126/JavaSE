package com.iamning.thread;
//测试守护线程
//例子：上帝守护你
public class TestDaemon {
    public static void main(String[] args) {
        God god=new God();
        You you=new You();
        Thread thread=new Thread(god);
        thread.setDaemon(true);//默认是false表示是用户线程，正常的线程都是用户线程...
        thread.start();//上帝守护线程启动
        new Thread(you).start();//用户线程启动

    }
}
//上帝
class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("上帝笑笑不说话");
        }
    }
}

//你
class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生不开心的活着");
        }
        System.out.println("=====给爷死======");
    }
}