package com.company.array;

public class ArrayDemo0322_4 {
    public static void main(String[] args) {
        int[]arrays={1,2,3,4,5};
        //专门遍历数组的jdk1.5  没有下标
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//        printArray(arrays);
        int [] reverse =reverse(arrays);
        //把反转好的数组传给revere数组
        printArray(reverse);
        //再调用printArray进行打印
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
    //反转数组
    //修饰符 静态(类方法) 返回参数形式是数组 方法名是reverse 形参输入一个数组
    public static int[] reverse (int[] arrays){
        int[] result=new int[arrays.length];
        //定义一个和输入参数数组相同长度的数组
        //反转的操作
//        for (int i = 0,j= result.length-1; i < arrays.length ; i++,j--) {
//            result[j]=arrays[i];
//            //从输入数组开始赋值给倒着的结果数组
//        }
        //
        for (int i = 0; i < arrays.length; i++) {
            result[arrays.length-1-i]=arrays[i];
        }

        return result;
        //返回结果
    }
}
