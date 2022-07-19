package com.iamning.scanner;

import java.util.Scanner;

public class Demo0321_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //从键盘接收数据
        int i=0;
        float f=0.0F;
        System.out.println("请输入整数：");
        //

        if(scanner.hasNextInt()){
            i= scanner.nextInt();
            System.out.println("整数数据："+i);
        }else{
            System.out.println("输入的不是整数数据！！");
        }
        //        scanner.close();
        //java.lang.IllegalStateException
        // 该异常表示，当前对客户端的响应已经结束，
        // 不能在响应已经结束（或说消亡）后再向客户端（实际上是缓冲区）输出任何内容。
        System.out.println("请输入小数：");
        if(scanner.hasNextFloat()){
            f= scanner.nextFloat();
            System.out.println("小数数据："+f);
        }else{
            System.out.println("输入的不是小数数据！！");
        }
        scanner.close();
    }
}
