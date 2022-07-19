package com.iamning.string;

import java.util.Locale;

//String和StringBuilder

public class StringTest {
    public static void main(String[] args) {
        //字符串都是对象
        String string="sjks";
        String s="sjksj";
        //转换成大写
        System.out.println(string.toUpperCase());
        //是否包含某个字符串
        System.out.println(string.contains("jk"));
        //引用地址不同
        System.out.println(s==string+"j");
        //String对象是唯一可以用+运算符进行连接的
        //也就是所谓的运算符重载
        System.out.println(s.equals(string+"j"));
        //字符串对象拼接后产生了一个新的对象
        //String字符串是不可变的！只能通过+进行拼接

        //StringBuilder是一个可变字符串

        StringBuilder stringBuilder =new StringBuilder();

        //链式存储
        stringBuilder.append("a").append("b");
        System.out.println(stringBuilder.toString());

        String result="String"+"delete";//优化成一句
        System.out.println(result);
        //字符串分割
        String s1 = result.substring(3);
        //避免使用大量的字符串拼接
        System.out.println(s1);
    }
}
