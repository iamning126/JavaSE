package com.iamning.method;

public class Demo0322_3 {
    public static void main(String[] args) {

        Demo0322_3 demo0322_3 = new Demo0322_3();
        demo0322_3.test(1,2,3,4,5,6);
        printMax(34,50,60,70,80);
        printMax(new double[]{1,2,3});
    }
    public void test(int... i){
        for (int j = 0; j <=5; j++) {
            System.out.println(i[j]);
        }
        //ArrayIndexOutOfBoundsException 数组下标越界
    }
    public static  void printMax(double... numbers){
        if (numbers.length==0){
            System.out.println("NO argument pass");
            return;
        }
        double result=numbers[0];
        //排序
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>result){
                result=numbers[i];
                System.out.println(numbers[i]);
            }
        }
        System.out.println("The max value is "+result);
    }
}
