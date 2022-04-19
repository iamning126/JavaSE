package com.company.oop.Demo10;
//abstract关键字
//抽象类
//extends-只有单继承   ，  接口有多继承去弥补
//接口类似插座，可以插什么样的插头，并不约束使用什么电器
public abstract class Action {
    //约束——有人帮我们实现
    //抽象方法，只有方法名字，没有方法实现
    public abstract void doSomething();
    //1、不能new这个抽象类，只能靠子类去实现，也就是说不能实例化
    //2、抽象类也可以写普通的方法，
    //3、抽象方法必须在抽象类中。
    //抽象的抽象：约束——
    //思考题： 抽象方法既然new方法，是否存在构造器？
    //打开class文件看看源码
    //Abstract存在的意义：  抽象出来——为了提高开发效率
    //                    简化一个复杂对象的基本要素再继承重写
    //                    细化具体功能
}
