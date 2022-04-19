package com.company.method;

public class Demo0322_5 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    //递归思想：调用自身迭代
    //main->f(5*f(4))->f(5*4*f(3))->f(5*4*3*2*1)
    //阶乘
    public static int f(int n){
        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
    //java使用栈机制，递归嵌套如果太深，空间不足，物理上会导致内存崩溃，时间会过长
    //计算器
}
