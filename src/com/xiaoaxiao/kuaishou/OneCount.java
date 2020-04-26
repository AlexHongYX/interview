package com.xiaoaxiao.kuaishou;

import java.util.Scanner;

/**
 * Created by xiaoaxiao on 2020/4/26
 * Description:
 */
public class OneCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = scanner.nextInt();
                if (((i==0||i==x-1)&&arr[i][j]==0)){
                    arr[i][j] = 3;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j]==1 && i-1>=0 && i+1<x && j-1>=0 && j+1<y
                        && arr[i-1][j]==0 && arr[i+1][j]==0&&arr[i][j-1]==0&&arr[i][j+1]==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
