package com.company.struct;

public class DemoFor0321_5 {
    public static void main(String[] args) {
        //从JDK5以后有了增强for循环
        int[] numbers={10,20,30,40,50};
        for (int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("===================");
        //遍历数组的每个元素
        for (int x:numbers) {
            System.out.println(x);
        }


    }
}
