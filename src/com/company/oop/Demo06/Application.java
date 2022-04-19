package com.company.oop.Demo06;

public class Application {

    public static void main(String[] args) {
//        Person person = new Person();
//        Student student = new Student();
//        student.test("胡宁");
//        student.test1();
        //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();//A类的方法
        B b = new A();
        //A类的对象调用B类的方法
        //父类（B）的引用指向的子类（A）的对象
        b.test();//B类的方法
        //静态的方法和非静态方法区别很大
        //静态方法：只调用左边的，
        //因为静态方法是类的方法，
        //而非静态方法是对象的方法，
        //有static时，b调用的是B类的方法，b使用B类的方法
        //没有时，b是对象的方法，b是A类的new对象，因此调用A类方法



        //非静态：重写
    }
}
