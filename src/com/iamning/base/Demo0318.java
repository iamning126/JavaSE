package com.iamning.base;

public class Demo0318 {
    //main方法
    //类变量 static
    static double salary=2500;
    //final static double PI=3.14;
    //修饰符不存在先后顺序
    //还可以在前面加public，private等四种
    static final double PI=3.14;
    static {
        //代码块
    }

    String name;
    int age;
    //属性：变量
    //实例变量：从属于对象,
    // 如果不自行进行初始化，这个类型的默认值  0（整数） 0.0（小数）
    // 布尔值：默认是false
    //除了基本类型，其余都是null
    public static void main(String[] args) {
         //java变量是程序中最基本的存储单元，其包括三要素，包括变量名，变量类型和作用域
        /*
            每个变量都有类型，类型可以是基本类型，也可以用引用类型（接口，对象，数组）
            变量名是合法标识符
         */
        //int a,b,c;程序的可读性
        String name="huning";
        char  x='X';
        double Pi =3.14;
        //局部变量：必须声明和初始化值
        int i=10;
        System.out.println(i);
        //变量类型(包名) 变量名字=new demo3_18（）
        //得到变量
        Demo0318 demo0318=new Demo0318();
        System.out.println(demo0318.age);
        System.out.println(demo0318.name);
        //类变量   static
        System.out.println(salary);
        //可以直接输出类变量
        System.out.println(PI);
        //常量引用
        //定义变量时要遵循驼峰原则
        //驼峰原则：除了第一个单词，后面的单词首字母大写，比如lastTime
        //常量：大写加下划线：MAX_VALUE
        //类名：首字母大写加驼峰原则:MAN
        //方法名：首字母小写和驼峰原则：run（），runRun（）
    }
    //其它方法

    public void add(){
        System.out.println(age);
    }



}
