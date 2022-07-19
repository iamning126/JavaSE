package com.iamning.oop.Demo11;
//抽象类：extends- 单继承
//类 可以实现接口 implements 接口 多继承
//实现了接口中的类，就需要重写接口中的方法
//多继承~利用接口实现多继承~
public class UserServiceImpl implements UserService,TimeService{
    public UserServiceImpl() {
        super();
    }

    @Override
    public void run(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void time() {

    }
}
