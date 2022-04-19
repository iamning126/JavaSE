package com.company.exception.Demo01;

public class Test2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        //快捷键：选中代码然后Crtl+Alt+T
        try {
            System.out.println(a/b);
        } catch (Exception e) {
//            System.exit(1);结束系统状态
            e.printStackTrace();//打印错误的栈信息
        }finally {

        }
    }
}
