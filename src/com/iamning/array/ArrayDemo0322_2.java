package com.iamning.array;

public class ArrayDemo0322_2 {
    //静态初始化 创建+赋值
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        //数组就固定这么大，且无法插入
        //Man[] men ={new Man(),new Man()};
        // 创建引用类型数组
        System.out.println(a[0]);

        //动态初始化:包含默认初始化
        int[] b=new int[10];
        b[0]=10;
        System.out.println(b[0]);
        System.out.println(b[2]);
        //其长度是确定，数据一旦被创建，它的大小不可以改变
        //其元素必须是相同类型，不允许出现混合类型
        //数组元素可以是任何数据类型，包括基本数据类型和引用数据类型
        //数组变量属于引用类型，数组也可看成对象，数组中每个元素相当于该对象的成员变量
        //数组本身就是对象，java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型
        //数组本身就是在堆中
    }
}
