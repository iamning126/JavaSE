package com.iamning.lambda;



/**
 * @author Administrator
 */
public class TestLambda2 {

    public static  void main(String[] args) {
        /**
         * 匿部内部类
         */
        ILove love=null;
//        ILove love=new ILove(){
//            @Override
//            public void love(int a) {
//                System.out.println("i love you 1-->"+a);
//            }
//        };
//        //1、lambda表示简化
//        ILove love=(int a)->{
//            System.out.println("i love you 1-->"+a);
//        };
//        //简化1.参数类型
//        love =(a)->{
//                System.out.println("i love you 2-->"+a);
//        };
//        //简化2.简化括号
//        love=a -> {
//            System.out.println("i love you 3-->"+a);
//        };
        //简化3.去掉花括号（假如只有一行才可以）
        love=a -> System.out.println("i love you 4-->"+a);
        //总结：
            //lambda表达式只能有一行代码情况下才能简化成为一行，如果有多行，那么就用代码块包裹
            //前提是接口为函数式接口（只能有一个方法）
        //多个参数也可以同样去掉参数类型，要去掉就都去掉,必须加上括号
        love.love(521);
    }
}
interface ILove{
    /**
     * love方法
     * @param a
     */
    void love(int a);
}
