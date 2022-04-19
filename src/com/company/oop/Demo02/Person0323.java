package com.company.oop.Demo02;
//java---->class
public class Person0323 {
    //一个类即使什么都不写，它也会存在一个方法
    //显示的定义构造器
    String name;
    int age;
    //无参构造器
    //其实就是一个和类相同名称的方法
    //实例化初始值
    //1、使用new关键字，必须要有构造器，
    // 因为使用new就是在调用构造器
    //2、用来初始化
//    public Person(){
//    }
//    //有参构造:一旦定义了有参构造，无参就必须显示定义
//    public Person(String name){
//        this.name=name;
//    }
//    //alt+insert 快捷键生成构造器

//    public Person() {
//    }

    public Person0323(String name) {
        this.name = name;
    }

    public Person0323(String name, int age) {
        this.name = name;
        this.age = age;
        //this可以理解为当前对象
        //说白了，构造器就是实例化对象前的准备工作，
        //以应对输入不同参数时有不同方法构造对象
    }

}
/*
    构造器 :1、和类名相同
           2、没有返回值
     作用：  1、new关键字
            2、初始化对象的属性
     注意点：  定义了有参构造之后，如果想使用无参构造
                必须先声明一个无参构造
                alt+insert选constrctor
         一个类有许多构造函数，
         有时候想在一个构造函数中调用其他构造函数，
         以避免代码重复，可以使用this关键字
 */

