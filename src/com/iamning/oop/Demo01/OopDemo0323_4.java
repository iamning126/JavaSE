package com.iamning.oop.Demo01;

public class OopDemo0323_4 {

    public static void main(String[] args) {
        int a=1;
        System.out.println(a);

       OopDemo0323_4.change(a);
       //扔进去一个a不进行处理
        //1、第一是a是一个对象引用，不是具体值
        //2、可能是没有返回值所以，就算处理也不会返回给主函数
        System.out.println(a);
        //输出为1



    }
    //void：返回值为空
    public static void change(int a){
        a=10;
    }

}
