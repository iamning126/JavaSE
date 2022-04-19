package com.company.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i=0;
        while (i<100){
            i++;
            if (i%5==0){
                System.out.println();
                continue;
                //用于强行跳出这次循环
            }
            System.out.println(i);
        }
        //break用于任何循环语句的主体部分，均可用break控制循环的流程
        //break用于强制退出循环，不执行循环中其他剩余部分（break也经常用于switch语句中使用）
        //continue 语句用在循环体中，用于终止某一次循环，跳出这次，转而进行下次循环

    }
}
