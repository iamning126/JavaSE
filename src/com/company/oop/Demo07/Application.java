package com.company.oop.Demo07;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
//        new Person();
        //可以指向的引用类型就不确定了:父类的引用指向子类
        Student s1=new Student();
        Person  s2=new Student();
        Object  s3=new Student();
        s2.run();
        System.out.println(s2.a);
        //只能使用父类的属性
        //Student能调用的方法都是自己或者继承的方法
        //Person 父类型，可以指向子类，但是不能调用子类独有的方法
        //S2是Person引用，无法调用子类有父类没有的方法
        //子类一旦的重写了父类的方法
        //只调用子类
        ((Student) s2).eat();
        s1.run();
    }
}
