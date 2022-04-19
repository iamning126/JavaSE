package com.company.array;

import java.util.Arrays;

public class ArrayDemo0322_6 {
    public static void main(String[] args) {
        int [] A ={32,26,45,10,9535,5454};
        System.out.println(A);//[I@7960847b
        //hashcode
        //打印数组元素
        //System.out.println(Arrays.toString(A));
        Arrays.sort(A);//数组进行升序排列
        System.out.println(Arrays.toString(A));
        printArray(A);

        Arrays.fill(A,2,4,6);
        //将value的值从数组下标第2开始-第4为止（不包括4）赋值
        System.out.println(Arrays.toString(A));
    }
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == a.length - 1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ",");
            }
        }
    }
}
