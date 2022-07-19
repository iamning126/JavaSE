package com.iamning.scanner;

import java.util.Scanner;

public class Demo0320_1 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner=new Scanner(System.in);
        //创建一个对象用于接收用户输入 System类的in接口
        System.out.println("使用next方法接收：");
        //使用hasNext（）和hasNextLine判断用户串有没有输入字符串
        if(scanner.hasNext()==true){
            String str =scanner.next();
            //程序会一直等待用户输入完毕
            //通过scannner.next和.nextLine获取输入的字符串
            System.out.println("输出的内容为："+str);
        }
        scanner.close();
        //关闭sanner类，否则会占用资源
        //scanner属于IO流的类，所以一般都要关闭
        /*
        next（）不能接收带有空格的字符串
        输入有效字符前的空格会被去除（例如：空格+hello依旧输出hello）
        输出有效字符后的空格会被当成结束符（这也是为什么输入hello world，只打印hello）
         */
    }
}
