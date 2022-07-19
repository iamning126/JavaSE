package com.iamning.gof23.single;

//饿汉式
//单例模式
public class Hungry {

    //可能会浪费空间
    private byte[] data1=new byte[1024*1024];
    private Hungry(){
    }

    private final static  Hungry HUNGRY=new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
