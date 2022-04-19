package com.company.array;

public class ArrayDemo0322_5 {
    public static void main(String[] args) {
        //四行两列
        /*
        1,2   array[0]
        1,3   array[1]
        3,4   array[2]
        4,5   array[3]
         */
        int[][] array ={{1,2},{1,3},{3,4},{4,5}};
        printArray(array[0]);
        System.out.println(array[0][1]);
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print (array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
