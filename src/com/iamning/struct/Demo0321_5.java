package com.iamning.struct;

public class Demo0321_5 {
    public static void main(String[] args) {
        String name="学士";
        //JDK的新特性，表达式结果可以是字符串
        //字符的本质还是数字
        //反编译 java-->class(字节码文件)-->反编译（IDEA）
        //把class文件复制到src对应的文件夹可以查看反编译的源码

        switch (name){
                case "学生":
                System.out.println("胡宁");
               break;
               case "胡宁":
                System.out.println("就是学生");
               break;
            default:
                 System.out.println("你要组撒？");
        }
    }
}
