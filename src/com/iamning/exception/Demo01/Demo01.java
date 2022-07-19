package com.iamning.exception.Demo01;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println();
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
    //ERRO:StackOverflowError
    // jvm规定了栈的最大深度，当执行时栈的深度大于了规定的深度，就会抛出StackOverflowError错误。
}
