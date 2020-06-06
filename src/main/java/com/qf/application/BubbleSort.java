package com.qf.application;

/**
 * @author ChenJie
 * @date 2020-06-04 13:32:33
 * 功能说明
 */

import java.util.Arrays;

/**
 * 手写一个冒泡排序
 */
public class BubbleSort {
    private static int[] arr = {32,43,54,65,42,67,23};
    public static void main(String[] args) {
        int temp ;
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
