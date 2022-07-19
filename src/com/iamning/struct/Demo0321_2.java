package com.iamning.struct;

import java.util.Scanner;

public class Demo0321_2 {
    public static void main(String[] args) {
        //考试分数大于60分就是及格，小于60分就是不及格
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的分数：");
        int score=scanner.nextInt();
        if(score>=60) {
            System.out.println("您及格了！！");
        } else{
            System.out.println("您不及格？！");
        }
        scanner.close();
}}
