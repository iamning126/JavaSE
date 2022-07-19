package com.iamning.reflection;
//测试类什么时候初始化
public class Test06 {
    static {
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1、主动调用
        //new一个对象就是主动调用，初始化时会先加载父类的初始化，然后子类再初始化
//        Son son=new Son();
//        //反射也会产生主动引用
//        Class.forName("com.company.reflection.Son");
        //不会产生类的引用的方法
        //通过子类调用父类的静态方法b
        //只有父类会被加载
//        System.out.println(Son.b);
        //数组只有main类被加载，不会加载类
//        Son[] array=new Son[5];
        //调用常量池，只有main类被加载
        System.out.println(Son.M);
    }
}
class Father{
    static int b=2;
    static {
        System.out.println("父类被加载");
    }

}
class Son extends Father{

    static {
        System.out.println("子类被加载");
        m=300;
    }
    static int m=100;
    static final int M=1;
}