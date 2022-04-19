package com.company.base;

public class Demo0317 {

        public static void main(String[] args) {
            // write your code here
            int i=128;
            byte b=(byte)i;
            //强制类型转换(类型)   高->低
            //自动转换     低->高
            System.out.println(i);
            //这里输出b答案错误，原因是内存溢出
            System.out.println(b);
        /*
        注：
        1、不能对布尔值进行转换
        2、不能把对象类型转换为不相关的类型
        3、在把高容量转换到低容量，需要进行强制转换
        4、在转换的时候可能存在内存溢出或者是精度问题
         */
            System.out.println("==================");
            System.out.println((int)23.1);
            //输出整数部分23
            System.out.println((int) -45.89F);
            //输出-45，精度丢失
            char c='a';
            int d=c+1;
            System.out.println((char)d);
            //操作比较大的数的时候，注意溢出问题
            //JDK7新特性，数字之间可以用下划线分割
            int money=10_0000_0000;
            int years=20;
            int total =money*years;
            //输出-1474836480，计算结果溢出
            long total2 =money*years;
            //思路是：用long型来赋值，结果答案依旧是-1474836480
            //默认是int类型，计算之前的已经存在问题
            long total3=money*((long)years);
            System.out.println(total3);
            //注：由于l和1分不清，在编码时尽管可以使用大写和小写的L进行定义long类型，尽量使用大写L，如long a=324L
        }
    }


