package com.company.method;

public class Demo0322_2 {
    public static void main(String[] args) {
        //args.length 数组长度
        //命令行传递参数
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]:"+args[i]);
        }
    }
}
