package com.company.syn;

import java.util.ArrayList;
import java.util.List;

public class UnsafeLIst {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                //线程不安全，线程同时添加数据到同一个位置，
                // 导致后面覆盖了上一个数据，最后统计时缺少了，所导致的线程不安全
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }

            }).start();
        }
        //延时
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
