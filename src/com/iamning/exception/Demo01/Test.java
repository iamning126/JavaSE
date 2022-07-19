package com.iamning.exception.Demo01;

public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try {
            new Test().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        //假设要捕获多个异常：一定从小到大
//        try {
//            if (b==0){
//                //主动抛出异常 throw   throws
//                throw new ArithmeticException();
//            }
////            new Test().a();
//            //try 监控区域
//            System.out.println(a/b);
//        }catch (Error e){//catch 捕获异常
//            System.out.println("Error");
//        }catch (Exception e) {
//            System.out.println("Exception");
//        }catch (Throwable e) {
//            System.out.println("Throwable");
//        }finally {//处理善后工作
//            System.out.println("finally");
//        }
        //finnally 可以不要finally 假设IO，资源关闭！
    }
//    public  void  a(){
//        b();
//    }
//    public void b(){
//        a();
//    }
    //假设这个方法中，处理不了这个异常
    public void test(int a,int b)throws ArithmeticException{

            if (b==0){
                //主动抛出异常 throw   throws
                throw new ArithmeticException();
                //一般在方法中使用
            }


    }
}

