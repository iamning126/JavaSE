package com.company.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取Class对象
        Class c1 = Class.forName("com.company.reflection.User");
        //构造一个对象
//        User user = (User) c1.newInstance();//本质是调用了类的无参构造器
//        System.out.println(user);
        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user1=(User)constructor.newInstance("阿宁",001,18);
        System.out.println(user1);
        //通过反射调用普通方法
        User user3 = (User)c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke：激活的意思
        //（对象，"方法的值"）
        setName.invoke(user3,"阿宁");
        System.out.println(user3.getName());
        //通过反射操作属性
        System.out.println("================ ");
        User user4=(User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法
        name.setAccessible(true);//赋予操作权限
        name.set(user4,"阿牛");
        System.out.println(user4.getName());

    }
}
