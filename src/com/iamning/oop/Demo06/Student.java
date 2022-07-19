package com.iamning.oop.Demo06;

public class Student extends Person{
    private String name="阿宁";
    public void test(String name){
        System.out.println(name);
        //传入的行式参数 name
        System.out.println(this.name);
        //当前类（Student）的属性name
        System.out.println(super.name);
        //父类（Person）的属性name
    }
    public void test1(){
     print();
     this.print();
     super.print();
    }
    public void print(){
        System.out.println("STUDENT");
    }

    public Student() {
        //隐藏代码：调用了父类的无参
        //而且调用父类构造器必须在子类第一行
       super("name");//平时不需要打这行自动执行
    //    this("huning");this和super调用构造方法只能使用一个
        System.out.println("Student的无参构造执行");
    }

    public Student(String name) {
        super(name);
        this.name = name;
    }
}
