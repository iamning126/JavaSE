package com.company.oop.Demo09;
//加final关键字就无法继承
public  class Person {
    //看一下代码块加载顺序
    {
        System.out.println("匿名代码块");
        //匿名代码块
    }
    static{
        //静态代码块
        //和类一起加载，且仅执行一次
        //当创建第二个对象时，便不执行
        System.out.println("静态代码块");
    }

    public Person() {
        //构造方法
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("=====================");
        Person person1 = new Person();
    }
}

