package com.iamning.oop.Demo12_extends;
//面向对象思想
public class Test {
    public static void main(String[] args) {
        //没有名字初始化类，不用将实例保存在变量中
        //Apple apple = new Apple();
        new Apple().eat();

        UserService userService = new UserService() {
            @Override
            public void hello() {

            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface  UserService{
    void hello();
}