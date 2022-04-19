package com.company.lambda;

/**
 * 推导lambda表达式
 * @author Administrator
 */
public class TestLambda1 {
    /**
     * 3、静态内部类Like2
     */
    static class Like2 implements ILike{
       @Override
       public void lambda() {
           System.out.println("i like lambda2");
       }
   }



    public static void main(String[] args) {
        //接口回调：
        ILike like =new Like1();
        like.lambda();
        like=new Like2();
        like.lambda();
        /**
         * Like3
         * 4、局部内部类Like3
         */
        class Like3 implements ILike{
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        like=new Like3();
        like.lambda();
        //5、匿名内部类，没有类的名称，必须借助接口或者父类
        like=new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
        like.lambda();
        //6、Lambda简化
        like=()->{
            System.out.println("i like lambda5");
        };
        like.lambda();

    }
}
/**
 * 1、定义一个函数式接口
 */
interface ILike {
    /**
     * 函数式接口里创建lambda方法
     */
    void lambda();
}

/**
 * 2、实现接口的类
 */
class Like1 implements ILike{
    @Override
    public void lambda() {
        System.out.println("i like lambda1");
    }
}