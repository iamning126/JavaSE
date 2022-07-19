package com.iamning.scanner;

import java.util.Scanner;

public class Demo0320_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //从键盘（system.in）接收数据，并且使用Scanner类定义一个scanner对象
        System.out.println("使用nextLine方法接收：");
        //用if判断是否还有输入
        if(scanner.hasNextLine()){
            String s = scanner.nextLine();
            //nextLine是以回车为结束符的，回车之前的所有字符
            //因此可以得到空白
            System.out.println("输出的内容为："+s);
        }
        scanner.close();
    }
}
