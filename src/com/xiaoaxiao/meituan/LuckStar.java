package com.xiaoaxiao.meituan;

import java.util.Scanner;

/**
 * Created by xiaoaxiao on 2020/4/23
 * Description:
 */
public class LuckStar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            arrX[i] = Integer.valueOf(str.split(" ")[0]);
            arrY[i] = Integer.valueOf(str.split(" ")[1]);
        }




        int[] maxXs = new int[2001];
        int[] minXs = new int[2001];
        int[] maxYs = new int[2001];
        int[] minYs = new int[2001];

        for (int i = 0; i < 2001; i++) {
            maxXs[i] = Integer.MIN_VALUE;
            maxYs[i] = Integer.MIN_VALUE;
            minXs[i] = Integer.MAX_VALUE;
            minYs[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++) {
            if (arrY[i]>maxYs[arrX[i]+1000]){
                maxYs[arrX[i]+1000] = arrY[i];
            }
            if (arrY[i]<minYs[arrX[i]+1000]){
                minYs[arrX[i]+1000] = arrY[i];
            }
            if (arrX[i]>maxXs[arrY[i]+1000]){
                maxXs[arrY[i]+1000] = arrX[i];
            }
            if (arrX[i]<minXs[arrY[i]+1000]){
                minXs[arrY[i]+1000] = arrX[i];
            }
        }

        int starCount = 0;
        for (int i = 0; i < n; i++) {
            if (arrX[i]<maxXs[arrY[i]+1000]&&arrX[i]>minXs[arrY[i]+1000]&&arrY[i]<maxYs[arrX[i]+1000]&&arrY[i]>minYs[arrX[i]+1000   ]){
                starCount++;
            }
        }

        System.out.println(starCount);
    }
}
