package com.company.oop.Demo04;
//0324
// 类
public class Student0324 {
    //属性私有 private
    //名字
    private String name;
    //学号
    private int id;
    //性别
    private char sex;
    //年龄
    private int age;
    //通过get（） 获取私有属性
    public String getName(){
        return this.name;
    }
    //通过set（） 设置属性值
    public void  setName(String name){
        //将传入的String类型name赋值给这个对象的name属性
        this.name=name;
    }
    //提供一些可以操作这个属性的方法
    //学习（）
    //睡觉（）
    //alt+insert选择getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<120 && age>0){
            //或者条件换成（age>120||age<0）
            //this.age=3
            this.age = age;
        }else{
            this.age=3;
        }
    /*
    封装的意义：
    1、提高程序的安全性，保护数据
    2、隐藏代码实现的细节
    3、统一接口
    4、提高系统的可维护性
     */
    }
}
