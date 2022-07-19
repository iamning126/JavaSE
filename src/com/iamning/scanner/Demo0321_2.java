package com.iamning.scanner;

import java.util.Scanner;

public class Demo0321_2 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数，
        //每输入一个数字用回车确认，通过输入非数字来结束输入与输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum=0;
        //计算输入了多少个数字
        int total=0;
        System.out.println("请输入数据：");
        while (scanner.hasNextDouble()){

            double x= scanner.nextDouble();
            total++;//total=total+1
            sum=sum+x;
            System.out.println("你输入了第"+total+"个数据，当前结果是总和是"+sum);
        }
        System.out.println(total+"个数的和为"+sum);
        System.out.println(total+"个数的平均数是"+(sum/total));



        scanner.close();
    }
}
