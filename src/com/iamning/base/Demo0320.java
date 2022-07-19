package com.iamning.base;

//*代表通配符，意思是导入包下的所有类
public class Demo0320 {
    public static void main(String[] args) {
        //逻辑运算符
        //与（and） 或（or） 非（取反）
        boolean a=true;
        boolean b=false;
        //逻辑与运算，两个变量都为真，结果为真
        //逻辑或运算，一个变量为真就是真
        //逻辑非运算，进行与运算两个变量为假，就是真
        System.out.println("!(a&&b):"+!(a&&b));//逻辑非运算

        //短路运算
        int c=5;
        boolean d=(c<4)&&(c++<4);
        //当C<4为false时，C++不执行
        System.out.println(d);
        //false
        System.out.println(c);
        //答案还是5，证明c++不执行
        /*
        按位运算：
            优点：效率高
        A=  0011 1100
        B=  0000 1101
        --------------------
        A&B 0000 1100
        A|B 0011 1101
        A^B 0011 0001
        ^异或：相同则为0，不同则为1
        ~B= 1111 0010
        ~取反

        2*8=16   2*2*2*2
        <<      >>
        左移    右移
        0000 0000 0
        0000 0001 1
        0000 0010 2
        0000 0100 4
        0000 1000 8
        0001 0000 16
         */
        System.out.println(2<<3);
        //把0000 0010=2向左移3位=可计算2*8的答案
        int x=10;
        int y=20;

        x+=y;//x=x+y
        y+=x;//y=y+x
        System.out.println(x);
        System.out.println(y);
        //字符串连接符   +  ， String
        System.out.println(x+y);
        System.out.println("x+y="+x+y);
        //当一个String类+变量（顺序）时，会默认把String后的变量转换为String类型
        System.out.println(x+y+"x+y=");
        //当变量在前时则不会改变，直接进行计算
        //三元运算符
        //x(x：条件判断语句) ？ y ：z
        //如果x==true，则结果为y，否则结果为z
        int score=40;
        String result=score<60 ? "不及格":"及格";
        System.out.println(result);
        //运算符的优先级
        //自己总结一下
        //一般利用公司域名倒置作为包名
        //比如www.baidu.com的包名就是com.baidu.www


    }
}

