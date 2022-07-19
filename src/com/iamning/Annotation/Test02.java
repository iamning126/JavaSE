package com.iamning.annotation;

import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class Test02 {
 @MyAnnotation
    public void test(){

 }
}
//定义一个注解
//一个源文件只能有一个public类，且与文件名相同
//一个源文件可以有非public类
//Target  表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示我们的注解在什么地方有效
//范围大小：runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)
//@Documented表示是否将注解生成在Javadoc中
@Documented
//@Inherited子类可以继承父类的注解
@Inherited
 @interface MyAnnotation{

}