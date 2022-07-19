package com.iamning.oop.Demo01;
//对象，内存！
public class OopDemo0323_5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        OopDemo0323_5.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        //person是类实例化的对象，--->Person person = new Person();这是一个具体的人，可以改变属性
        //name是实例化对象下的一个属性
        person.name="阿宁";
    }
}


//定义了一个Person类，有一个属性：name
class Person{
    String name;//null
}
