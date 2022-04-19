package com.company.struct;

public class Demo0321_8 {
    public static void main(String[] args) {
        int a=0;
        while (a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("==============");
        do {
            System.out.println(a);
            a++;
        }while (a<0);
        //证明虽然不满足条件，do while依旧会输出至少一次
    }
}
