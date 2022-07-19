package com.iamning.struct;

public class Demo0321_7 {
    //while是先判断后执行，do while是先执行后判断跳出循环
    //所以do while至少能够被执行一次
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        do {
            sum=sum+i;
            i++;
        }while (i<=100);
        System.out.println(sum);
        }
    }

