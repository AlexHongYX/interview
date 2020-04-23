package com.xiaoaxiao.thoughtworks;

import java.util.Scanner;

/**
 * Created by xiaoaxiao on 2020/4/17
 * Description:
 */
public class wurenjiN {
    public static void main(String[] args) {
        int m,n;    // 地图长和宽
        int N;      // 拍摄总数

        System.out.println("输入地图的长和宽:");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();

        N = (n+2)/3*m;

        char[][] strs = new char[N][5];    // 记录拍摄的内容
        char[][] map = new char[m][n];     // 保存最终地图

        System.out.println("输入无人机数据:");
        // 保存无人机带回数据
        for (int i = 0; i < N; i++) {
            strs[i] = scanner.next().toCharArray();
        }

        System.out.println("输出:");
        for (int i = 0; i < strs.length / m; i++) {
            // 向下
            if (i % 2 == 0){
                for (int j = 0; j < m; j++) {
                    map[j][i*3] = strs[j+i*m][4];
                    if (i*3+1 < n) {
                        map[j][i * 3 + 1] = strs[j + i * m][0];
                    }
                    if (i*3+2 < n){
                        map[j][i*3+2] = strs[j+i*m][2];
                    }
                }
            }else { // 向上
                for (int j = 0,k = m-1; k>=0 ; j++,k--) {
                    map[k][i*3] = strs[j+i*m][4];
                    if (i*3+1 < n) {
                        map[k][i * 3 + 1] = strs[j + i * m][0];
                    }
                    if (i*3+2 < n) {
                        map[k][i * 3 + 2] = strs[j + i * m][2];
                    }
                }
            }
        }


        for (int i = 0; i < map.length; i++) {
            System.out.println(map[i]);
        }
    }
}
