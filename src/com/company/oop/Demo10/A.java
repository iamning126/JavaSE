package com.company.oop.Demo10;


//抽象类的所有方法，继承了它的子类，都必须要声明实现它的方法
//除非该子类也是抽象类，用abstract修饰
//呢么就用子子类实现，直到子子类不是抽象且继承为止
//理解：父债子偿
public class A extends Action {
    @Override
    public void doSomething() {

    }
    //继承抽象方法必须重写内部方法
}
