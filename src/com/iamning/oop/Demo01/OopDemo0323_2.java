package com.iamning.oop.Demo01;

public class OopDemo0323_2 {
    //静态方法 static
    public static void main(String[] args) {
        //实例化这个类
        //对象类型名 对象名称= new 对象值；
        Student student = new Student();
        student.say();
    }

    //非静态方法


    //和类一起加载的
    public static void a(){
//        b();
        //static不能调用非静态方法
    }
    //类实例化 之后才存在
    public void b(){
        a();
        //动态方法可以相互调用
    }
}
