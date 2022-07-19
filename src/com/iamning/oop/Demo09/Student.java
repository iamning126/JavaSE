package com.iamning.oop.Demo09;
//static关键字：
public class Student extends Person {
    private static int age;//静态变量 （多线程可能会使用）
    private double score;//非静态变量
    public  void run(){

    }
    public static void  go(){

    }
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.age);
        //用static修饰的变量可以用类名直接访问
        //System.out.println(Demo09.score);错误无法调用
        System.out.println(student.score);
        System.out.println(student.age);
        new Student().run();
        go();
        //静态方法在加载前和类一起加载
    }
}
