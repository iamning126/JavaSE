package com.iamning.gof23.single;

//懒汉式单例模式
public class LazyMan {
    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"OK");
    }
    private static LazyMan lazyMan;
    //双重检测模式的 懒汉式单例 DCL懒汉式
    public LazyMan getInstance(){
        //加锁
        if(lazyMan==null){
            synchronized (LazyMan.class){
                if(lazyMan==null){
                    //不是一个原子性操作
                    lazyMan=new LazyMan();
                }
            }
            /**
             * 1.分配内存空间
             * 2.执行构造方法，初始化对象
             * 3.把这个对象指向这个空间
             *
             * 可能执行指令重排的情况
             *
             * 不同线程下指令重排导致的问题，
             */
        }
        return lazyMan;
    }
}
