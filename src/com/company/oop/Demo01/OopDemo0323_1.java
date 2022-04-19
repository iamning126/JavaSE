package com.company.oop.Demo01;

import java.io.IOException;

//OOP(Object Oriented Programming)面向对象的编程
public class OopDemo0323_1 {
    //oopDemo就是一个类
    //以类的方式组织代码，以对象的组织封装数据
    //以类的方式组织代码，以对象的组织封装数据
    //以类的方式组织代码，以对象的组织封装数据
    //以类的方式组织代码，以对象的组织封装数据
    //以类的方式组织代码，以对象的组织封装数据
    //以类的方式组织代码，以对象的组织封装数据
    //对象=方法+属性
    //抽象可以说就是抽出像的部分剥离出来
   //main方法
    public static void main(String[] args) {
        //多态
        //同样的方法对不同对象表现的形态不一样
        //同样输入不同参数，有不同的方法是重载
        //对象一个具体的事物，类，是抽象的概念
        //先有类后有对象
    }
    /*
    修饰符 返回值类型 方法名（...）{
        方法体
        return 返回值；
    }
     */
    //方法名 见名知意
    public String sayHello(){
        return "Hello,World";
    }
    //return 结束 返回一个结果（可以为空）
    public void print(){
        return;
    }
    public int max(int a,int b){
        return a>b? a:b;//三元运算符
    }
    //数组下标越界异常 Arrayindexoutofbounds
    //IOException
    public void readFile(String file)throws IOException{

    }
}
