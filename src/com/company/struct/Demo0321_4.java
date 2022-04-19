package com.company.struct;

public class Demo0321_4 {
    public static void main(String[] args) {
        //case穿透
        //switch匹配一个具体的值
        char grade='B';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
                //每写一个case加上一个break
                //switch可以比较字符串
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
