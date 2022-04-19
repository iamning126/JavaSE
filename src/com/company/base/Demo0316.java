package com.company.base;

/**
 * @author Administrator
 */
public class Demo0316 {
    public static void main(String[] args) {
	// write your code here
        /*
        单行注释只能备注一行
        多行注释能够注释一段文字代码
         */
        System.out.println("你好，世界");
        //输出一个你好，世界
        //javadoc:文档注释
        /**
         * @Description HelloWorld
         * @Author iamning
         */
        String student="胡宁";
        String man ="胡宁";
        //大小写十分敏感
        System.out.println(man);
        String 王者荣耀 ="百星王者";
        System.out.println(王者荣耀);
        //尽量少用中文对象和拼音
        //八大基本数据基本类型
        //整数（四种）：
        int num1=23;
        byte num2 =127;
        short num3=30;
        long num4=50L;
        //long类型要在数字后加个L
        //小数（两种）：浮点数
        float num5 =3.1F;
        //float类型要在数字后加个F说明，否则报错（java是强类型语言，必需按照规范书写）
        double num6 =3.141592653589793238462643;
        //字符
        char name ='胡';
        //char只能插入一个字符
        //字符串，String不是关键字，String是一个类
        String names ="胡宁";
        //布尔值：是非(true和false)
        boolean flag = true;
        //boolean flags =false;
        System.out.println(flag);
        System.out.println(num2);
        //整数拓展     进制      二进制     十进制     八进制0     十六进制0x
        int i=0xFF;
        //八进制0
        int i1=063;
        //十六进制0x
        System.out.println(i);
        //===============================================================
        //浮点数拓展       银行业务中金钱数额怎么表示？
        //建议使用BigDecimal       数学工具类
        //===============================================================
        //float    有限   离散     舍入误差      大约    接近但不等于
        //double
        //最好完全避免使用浮点型进行比较
        //最好完全避免使用浮点型进行比较
        //最好完全避免使用浮点型进行比较
        float f=0.1F;
        //0.1
        double d=1.0/10;
        //0.1
        System.out.println(f==d);
        //值相等，讨论为何输出false
        float d1=232323232323F;
        float d2=d1+1;
        System.out.println(d1==d2);
        //值不相等，讨论为何输出true
        //====================================================
        //字符拓展
        //====================================================
        char c1='a';
        char c2='中';
        System.out.println(c1);
        System.out.println((int)c2);
        //强制转换
        //所有字符本质还是数字
        //编码 unicode表 (继承ASCII表：97=a,65=A）： 2字节  0~65536        excel   2的16次方=65536；
        char c3='\u0061';
        //c3代表的unicode表第61位
        System.out.println(c3);
        //转义字符
        //\t    制表符
        //\n    换行
        //还有一些其他的转义字符

        System.out.println("Hello\nWorld");

        System.out.println("==================================");
        String sa=new String("hello world");
        String sb=new String("hello world");
        System.out.println(sa==sb);
        String sc="hello world";
        String sd="hello world";
        System.out.println(sc==sd);
        System.out.println(sa==sd);
        //对象   从内存分析
        //布尔值扩展
        boolean flags=true;
        if (flags == true){}
        if (flags) {}
        //这两句的意思相同，写下面这句可以让代码简洁
        //但是会降低代码的可读性，不建议新手使用
    }
}
