package com.company.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解

public class Test03 {
    //注解可以显式赋值，如果没有默认值，我们就必须要给注解赋值
    @MyAnnotation2(age = 18,name = "啊牛")
    public void test(){

    }
    @MyAnnotation3("阿宁")
    public void test2(){

    }

    public static void main(String[] args) {

    }
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation2{
    //注解的类型：参数类型+参数名（）
    String name() default "";
    int age() default -1;//如果默认值为-1,代表不存在，indexof，如果找不到就返回-1

    String[] schools() default {"小沟头高中"};
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation3{
    //当只有一个属性时，用value可以省略赋值直接写
    String value();
}