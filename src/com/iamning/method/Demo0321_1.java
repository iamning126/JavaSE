package com.iamning.method;

/**
 * @author Administrator
 */
public class Demo0321_1 {
    public static void main(String[] args) {
        int add = add(1, 45);
        System.out.println(add);
//        test();
    }
    //加法
    //创建方法
    //修饰符+static+返回值类型+方法名

    public static int add(int a, int b){
        return a+b;
    }
    //一个方法只完成一个功能

    /**
     *    //打印三角形 5行
     */
    public static void test(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
 }
