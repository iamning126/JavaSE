package com.company.array;

public class test {

    public static void main(String[] args) {
        //创建一个二维数组 为11*11     0表示没有棋子，1表示黑棋， 2表示白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        System.out.println("输出原始数据");

        int sum = 0;
        for (int i = 0; i <= array1.length - 1; i++) {
            for (int j = 0; j <= array1.length - 1; j++) {
                //打印数组
                System.out.print(array1[i][j] + "\t");

                //获取有效值个数
                if (array1[i][j] != 0) {
                    sum++;
                }
            }
            //换行
            System.out.println();
        }
        System.out.println("===============");

        //打印 有效个数
        System.out.println("有效数的个数:" + sum);
        System.out.println("===============");

        //创建一个稀疏数组的数组
        int[][] array2 = new int[sum + 1][3];

        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非0的值，放入稀疏数组
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                //判断语句：控制该行的读取数据的范围在[i][11]
                if (array1[i][j] != 0) {
                    count++;//统计非零数
                    array2[count][0] = i;//记录行号
                    array2[count][1] = j;//记录列号
                    array2[count][2] = array1[i][j];//将非零数赋值给新的表
                }
            }
        }

        //输出稀疏数组
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] +
                    "\t" + array2[i][1] + "\t"
                    + array2[i][2] + "\t");
        }

    }
}