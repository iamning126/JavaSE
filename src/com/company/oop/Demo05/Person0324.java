package com.company.oop.Demo05;
//Person 人：
//继承是类和类之间的关系
//除此之外还有依赖、组合、继承等
//在java中所有的类，都直接或者间接继承Object类
//一般都省略继承Object类
//因为只要创建一个类都继承
//java只有单继承，没有双继承
//一个子类只能有一个父类
//父类可以有很多的爸爸
//理解：一个儿子只能有一个爸爸，一个爸爸有很多个儿子
public class Person0324 /*extends Object*/ {

    private int money = 1000_000_000;
    //public可以继承
    //private无法继承
    //default
    //protected
    //四个优先级
    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
