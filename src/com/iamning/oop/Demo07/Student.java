package com.iamning.oop.Demo07;

public class Student extends Person{
    public int b=25;
    @Override
    public void run() {
        System.out.println("学生在跑");
    }
    public void eat(){
        System.out.println("学生在吃");
    }
    /*
    多态的注意事项：
    1、多态是方法的多态，属性没有多态
    2、父类和子类，有联系 类型转换异常！ClasscastException
    3、多态存在的必要条件：继承，方法需要重新，父类引用指向子类对象！
    Father father = new Son（）;
    哪些类不可以被重写
    1、static 方法 属于类 它不属于实例：
    2、final 常量：
    3、private 方法：
     */
}
