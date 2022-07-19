package com.iamning.array;

public class ArrayDemo0322_3 {
    public static void main(String[] args) {
        int[]arrays={1,2,3,4,5};
        //打印全部数组元素
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println("====================");
        int sum=0;
        for (int i = 0; i < arrays.length; i++) {
            sum+=arrays[i];
        }
        System.out.println("sum:"+sum);
        System.out.println("====================");
        //查找最大元素
        int max=0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i]>max){
                max=arrays[i];
            }
        }
        System.out.println("max:"+max);
    }
}
