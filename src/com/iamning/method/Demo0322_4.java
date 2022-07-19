package com.iamning.method;

public class Demo0322_4 {
    public static void main(String[] args) {
        Demo0322_4 demo0322_4 = new Demo0322_4();
        demo0322_4.test();
    }
    //递归头：什么时候不调用自身的方法。如果没有头，将陷入死循环。
    //递归体：
    public void test(){
        test();
    }
}
