package com.iamning.method;

public class Demo0322_1 {
    public static void main(String[] args) {
       int max = compare(20,20);
        System.out.println("较大的数为"+max);
    }
    //比大小
    public static int compare(int num1,int num2){
        int result=0;
        if (num1==num2){
            System.out.println("int相等");
            return 0;//终止方法
        }
        if(num1>num2){
            result=num1;
        }else {
            result=num2;
        }
        return result;
    }
    //当相同的方法输入不同类型的参数时有不同的处理方法，被称为方法重载
    public static double compare(double num1,double num2){
        double result=0;
        if (num1==num2){
            System.out.println("double相等");
            return num1;//终止方法
        }
        if(num1>num2){
            result=num1;
        }else {
            result=num2;
        }
        return  result;
    }
    public static int compare(int num1,int num2,int num3){
        int result=0;
        if (num1==num2){
            System.out.println("int相等");
            return 0;//终止方法
        }
        if(num1>num2){
            result=num1;
        }else {
            result=num2;
        }
        return result;
    }
    //主要根据的是形参确定而不是返回值确定
    //参数列表必须不同（个数不同，或类型不同，参数排列顺序不同）
    //方法的名称必须相同
    //原理：当方法名称相同时，编译器会根据调用的方法的参数个数，参数类型逐一去匹配，以选择对应的方法，
    // 如果匹配失败，则编译器报错
}
