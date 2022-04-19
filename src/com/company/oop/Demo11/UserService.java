package com.company.oop.Demo11;
//定义的关键字interface 接口都需要有实现类
public interface UserService {
    //抽象的思维~ Java  结构师
    //默认都是 public abstract，所以下面的可以省略
    //public abstract void Run();
    //接口中定义的都是常量
    //常量 默认都是这些修饰符public static final
     int AGE =99;
     //接口中的所有定义其实都是抽象的public static
    void run(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
