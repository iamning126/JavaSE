package com.company.struct;

public class DemoFor0321_2 {
    public static void main(String[] args) {
        //练习：计算0-100之间的奇数和和偶数和
        int oddsum=0;
        int evensum=0;
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){//奇数
                 oddsum+=i;
            }else{//偶数
                evensum+=i;
            }
        }
        //我的思路
//        for (int i = 0; i < 50; i++) {
//            oddsum=oddsum+2*i+1;
//            evensum=evensum+2*i;
//        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
