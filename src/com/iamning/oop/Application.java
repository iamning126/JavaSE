package com.iamning.oop;

import com.iamning.oop.Demo04.Student0324;

//一个项目应当只存在一个main方法
public class Application {
    public static void main(String[] args) {
//        //new 关键字实例化了一个对象
//        Person person = new Person("huning");
//        //类实例化对象
//        System.out.println(person.name);
//        Pet dog = new Pet();
//        dog.name="旺财";
//        dog.age=6;
//        dog.shout();
        /*
        1、类与对象
        类是一个模板
        对象是一个类具体实例
        2、方法
        定义、调用
        3、对应的引用
        引用类型：
            基本类型（8个）
         对象是通过引用来操作的
         栈（对象引用）------->堆（对象具体：对象属性（字段）和类方法）
         4、属性： 字段Field 成员变量
            默认初始化：
            数字：0 0.0
            char：u0000
            boolean：false
            引用：null
            修饰符 属性类型 属性名=属性值
          5、对象的创建和使用
          -必须使用new关键字创造对象，还必须使用构造器
          Person huning =new Person();
          -对象的属性huning.name
          -对象的方法huning.sleep()
          6、类
          静态的属性   属性
              +        +
          动态的行为   方法
         */
        //封装、继承、多态
        Student0324 s1 = new Student0324();
        //私有属性无法直接获取
        // s1.name无法使用

        String name = s1.getName();
        s1.setName("huning");
        System.out.println(s1.getName());
        s1.setAge(9999);
        //传入数据不合法
        //方法名，参数列表
        System.out.println(s1.getAge());
        System.out.println(name);
      //  Action action = new Action();//编译错误
        //Action是抽象的; 无法实例化
    }
}
