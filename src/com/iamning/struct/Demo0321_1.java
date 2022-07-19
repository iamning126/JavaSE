package com.iamning.struct;

import java.util.Scanner;

public class Demo0321_1 {
    public static void main(String[] args) {
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        System.out.println("hello5");
        System.out.println("hello6");
        //顺序结构
        //等于没说
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String s=scanner.nextLine();
        //equals:判断字符串是否相等
        if(s.equals("Hello")){
            System.out.println(s);
        }
        //if单选择
        System.out.println("end");
        scanner.close();
    }
}
