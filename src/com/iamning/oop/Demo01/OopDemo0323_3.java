package com.iamning.oop.Demo01;

public class OopDemo0323_3 {
    public static void main(String[] args) {
        //实际参数和形式参数的数据类型要一一对应
        OopDemo0323_3 oopDemo0323_3 = new OopDemo0323_3();
        System.out.println(oopDemo0323_3.add(2,3));
        int add=OopDemo0323_3.add1(3,4);
        System.out.println(add);
    }
    public int add(int a,int b){
        return a+b;
    }
    public static int add1(int a,int b){
        return a+b;
    }
}
