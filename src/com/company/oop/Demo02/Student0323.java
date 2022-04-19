package com.company.oop.Demo02;

//学生类
public class Student0323 {
    //对象是具体的事物
    //类是抽象的
    //类是对象的模板
    //属性：字段
    String name;
    int age;
    public void study(){
        //this：当前这个类
        System.out.println(this.name+"学生在学习");
    }
    //对世界有个模块化理解
    /*
        //类：抽象的，实例化
        //类（Student）实例化以后会返回一个自己的对象（student）！
        //student对象就是一个Student类的具体实例
        Student xiaohong = new Student();
        Student xiaoming= new Student();
        xiaoming.name ="小明";
        xiaoming.age =2;
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
     */
}
