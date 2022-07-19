package com.iamning.oop.Demo08_0325;

public class Application {
    public static void main(String[] args) {
        //Object->String
        //（创建的Student对象）Object->Person->Student
        //Object->Person->Teacher
        Object object = (Object) new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("=======================================");

        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错
        System.out.println("======================================");
        Student student = new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(student instanceof String);//编译报错
        //System.out.println(X instanceof Y);
        //看X和Y有没有父子关系
        //X：对象 Y：类
        //第一步：看引用关系和类在不在继承链上：例如object引用有三条路（三条继承链）可走，至少可以保证编译
        //第二步：看对象，object是Student的实例化，所以本质属于Student对象，在这条继承链上的才为true
        //同级关系或者跨继承链隔代关系直接无法编译
        //类型之间的转换：父 ---->子
        //高<------低
        //向上转很轻松
        Person student1 = new Student();

        //student将这个对象转换为Student类型，我们就可以使用Student类型的方法了
        //向下转需要强制类型转换
        //低<------高
        Student student11 = (Student) student1;
        //student1.go();无法调用子类特有的方法
        //因此进行强转
        //把student1引用从Person变成（Student）
        ((Student)student1).go();
        student11.go();
        //强转之后就可以调用特有的方法
        Person person1=student11;
        //再从低转到高
        //子类转到父类可能会丢失一些方法
        /*
        1、父类的引用指向子类的对象
        2、把子类对象转换成父类，向上转型：可以直接转
        会丢失一些子类独有的方法
        3、把父类转换为子类，向下转型：强制转换
        4、方便方便调用，减少代码冗余


        抽象： 封装 继承 多态
        抽象类：
        接口
         */
    }
}
