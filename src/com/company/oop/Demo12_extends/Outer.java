package com.company.oop.Demo12_extends;

public class Outer {

    private int id=99;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    public  class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        //获得外部类的私有属性
      public void getID(){
          System.out.println(id);
      }
    }
    //局部内部类
    public void method(){

        class Inner{
            public void in(){

            }
        }
    }
}
//一个java类里只有一个public class
//但是可以有很多 class
//class A{
//    public static void main(String[] args) {
//
//    }
//}
