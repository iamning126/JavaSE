package com.company.syn;

import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

//测试JUC安全类型的集合
public class TestJuc {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list =new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
