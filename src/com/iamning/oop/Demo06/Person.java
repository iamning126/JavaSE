package com.iamning.oop.Demo06;

public class Person {
    protected String name ="huning";

    public Person(String name) {

        System.out.println("Person无参执行了");
    }

    //如果这里的方法改成private
    //则使用super无法被继承，也就无法调用
    public void print(){
        System.out.println("PERSON");
    }

}
