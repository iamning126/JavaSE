package com.company.struct;

import java.util.Scanner;

public class Demo0321_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的分数：");
        int score=scanner.nextInt();
        /*
            1、if语句至少有1个else语句，else语句在所有的else if语句之后。
            2、if语句可以有若干个else if语句，它们必需在else语句之前
            3、一旦其中一个else if语句检测为true，其他的else if和else都将跳过执行
         */
        if(score==100) {
            System.out.println("恭喜满分！！S级");
        } else if (score<100&&score>=90){
            System.out.println("A级");
        }else if (score<90&&score>=80){
            System.out.println("B级");
        }else if (score<80&&score>=70){
            System.out.println("C级");
        }else if (score<70&&score>=60){
            System.out.println("D级");
        }else if (score<60&&score>=0){
            System.out.println("成绩不合格");
        }else {
            System.out.println("成绩不合法");
        }

        scanner.close();
    }
}
