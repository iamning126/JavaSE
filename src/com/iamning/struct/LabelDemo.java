package com.iamning.struct;

public class LabelDemo {
    public static void main(String[] args) {
        int count=0;
        //打印101~150的质数
        //不建议使用
        outer:for (int i=101;i<150;i++){
            for (int j = 2; j <i/2; j++) {
                if(i%j==0){
                    continue outer;
                }
            }
            count++;
            System.out.println(i+"");
        }
        System.out.println("101-150一共有"+count+"个质数");
    }
}
