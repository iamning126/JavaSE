package com.company.array;

import java.util.Arrays;

public class ArrayDemo0322_07 {
    public static void main(String[] args) {
        int[] a={3,5,1,2,9,8,4};
        int[] sort=sort(a);
        System.out.println(Arrays.toString(sort));
    }
    //冒泡排序
    //1、比较数组中，相邻的两个元素，如果第一个数字比第二个数大，就交换位置
    //2、每一次比较，都会产生出一个最大，或者一个最小的数字
    //3、下一轮则可以减少一次排序
    //4、依次循环，直到结束！
    public static int[] sort(int[] arrays){
        int temp=0;
        //临时变量
        //外层循环：判断我们这个循环要走多少次
        for (int i = 0; i < arrays.length-1; i++) {
            //内层循环：比较判断两个数字，如果第一个比第二个大，则交换位置
            //ps理解：个矮往前站一个,升序排列

            boolean flag=false;//通过flag标志位减少没有意义的比较
            for (int j = 0; j <arrays.length-1-i; j++) {
                if (arrays[j+1]<arrays[j]){
                    temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                    flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }
        return arrays;

    }
}
