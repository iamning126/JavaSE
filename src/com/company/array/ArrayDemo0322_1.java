package com.company.array;

public class ArrayDemo0322_1 {
    //变量的类型   变量的名字  =变量的值
    //数组类型
    public static void main(String[] args) {
        int[] nums;//1、声明定义数组类型，名称
        //在栈里
        //int nums2[];
        //c和c++的使用定义数组习惯
        nums =new int[10];
        //一般这样书写int[] nums= new int[10];
        //从栈到堆分配空间大小
        // 2、创建一个数组
        // 并且说明可以存放10个int类型的数字
        //3、给数组元素中赋值
        int sum=0;

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=i+1;
            sum+=nums[i];
            System.out.println(nums[i]);
        }
        System.out.println("总和为："+sum);
    }
}
