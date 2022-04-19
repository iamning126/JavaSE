package com.company.oop.Demo09;

import static java.lang.Math.random;
import static java.lang.Math.PI;

//静态导入包
public class Test {
    public static void main(String[] args) {
        System.out.println(random());
        //就可以直接使用Math类里的方法代替Math.random()
        System.out.println(PI);
    }
}
