package com.company.struct;

public class BreakDemo {
    public static void main(String[] args) {
        int i=0;
        while (i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;
                //用于强行跳出循环体
            }
        }
        System.out.println(i);
    }
}
