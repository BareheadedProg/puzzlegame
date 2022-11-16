package com.itheima.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //2.打乱数组中的数据顺序
        //遍历数组,跟随己索引上的数据进行数据交换
        for (int i = 0; i < arr.length; i++) {
            //生成随机数
            Random r = new Random();
            int index = r.nextInt(arr.length);
            //交换数据
            int tempArr = arr[i];
            arr[i] = arr[index];
            arr[index] = tempArr;
        }

        //打印交换后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //3.定义二维数组
        int [][] arr2 = new int[4][4];
        //4.遍历将一维数据添加到二维数组
        for (int i = 0; i < arr.length; i++) {
            arr2[i / 4][i % 4] = arr[i];
        }
    }
}
