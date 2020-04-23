package com.xiaoaxiao;

/**
 * Created by xiaoaxiao on 2020/4/16
 * Description:
 */
public class SortTest {

    // 冒泡，快排，堆排
    // 直接插入，归并，希尔，选择

    // 冒泡
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // 优化
            boolean flag = true;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
                if (flag){
                    break;
                }
            }
        }
    }

    // 快排
    private static void quickSort(int[] array){
        quick(array,0,array.length-1);
    }

    private static void quick(int[] array,int start,int end){
        /**
         * 优化:
         *      小区间，直接插入排序
         *      三数取中
         */
        // 一次快速排序只是将当前位置的左边都比当前值小，右边都比当前值大
        int par = portion(array,start,end);
        // 继续递归下去
        if (par > start+1){
            quick(array,start,par-1);
        }
        if (par < end - 1){
            quick(array,par+1,end);
        }

    }

    private static int portion(int[] array,int start,int end){
        int tmp = array[start];
        while (start < end){
            while (start<end&&array[end] >= tmp){
                end--;
            }
            if (start < end){
                array[start] = array[end];
            }else {
                break;
            }

            while (start<end&&array[start] < tmp){
                start++;
            }
            if (start<end){
                array[end] = array[start];
            }
        }
        // 此时start==end
        array[start] = tmp;
        return start;
    }



}
