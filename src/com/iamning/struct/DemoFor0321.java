package com.iamning.struct;

public class DemoFor0321 {
    public static void main(String[] args) {
        int a=1;//初始化条件
        while(a<=100){//条件判断
            System.out.println(a);//循环体
            a+=2;//迭代

        }
        System.out.println("while的循环结果："+a);
        //初始化；条件判断；迭代
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
        //快捷键100.fori可以快速打出for循环

        System.out.println("for循环结束！");
        /*
        最先执行初始化步骤，可以声明一种类型，但可初始化一个或者多个循环控制变量，也可以是空语句。
        然后检测条件判断是否为true，如果为true则执行循环体
        执行一次可以改变控制变量
        再次检测条件
         */



        //死循环
        for (; ; ) {

        }
    }
}
