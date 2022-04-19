package com.company.base;

public class Demo0319 {
    //1、算术运算符 2、关系运算符！=   instanceof 3、赋值运算符=
    //4、逻辑运算符&，|，^,~,<<,>>,>>>
    //5、条件运算符？：
    //6、扩展赋值运算符：+=，-=，*=，/=
    public static void main(String[] args) {
        //二元运算符
        //Ctrl+D 复制当前行到下一行
        int a=10;
        int b=12;
        int c=15;
        int d=25;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/(double)b);
        System.out.println(a*b);
        long e=123123123123L;
        int f=123;
        short g=10;
        byte i=92;
        System.out.println(e+f+g+i);//结果long型
        System.out.println(f+g);//结果int型
        //没有long时，非int型转为int在进行计算
        //表达式中含有byte、short、char型数据运算时，java首先会将变量自动转换成int型，然后进行计算
        System.out.println(g+i);//结果int
        //关系运算符返回的结果：正确/错误   布尔值来表示
        int a1=10;
        int a2=20;
        int c1=32;
        //取余：模运算
        System.out.println(c1%a);//c/a  32/10=3...2
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);//true
        //++   -- 自增 、自减
        int x = 3;
        int y = x++;
        //y=x=3 x++=x+1=4
        //执行完这行代码后，先给y赋值，再自增
        System.out.println(x);
        System.out.println(y);
        int z = ++x;
        //++x=x+1=5 z=x=5
        //先x自增，再给z赋值
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //幂运算 2^3  2*2*2=8
        //很多运算使用Math工具类来进行计算
        double pow=Math.pow(2,3);
        System.out.println(pow);

    }
}
