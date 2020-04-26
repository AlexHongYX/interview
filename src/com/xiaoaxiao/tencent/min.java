package com.xiaoaxiao.tencent;

import java.util.Scanner;

/**
 * Created by xiaoaxiao on 2020/4/26
 * Description:
 */
public class min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cishu = Integer.valueOf(scanner.nextLine());
        while (cishu != 0){
            int n = Integer.valueOf(scanner.nextLine());
            Point[] A = new Point[n];
            Point[] B = new Point[n];

            for (int i = 0; i < n; i++) {
                String str = scanner.nextLine();
                A[i] = new Point(Integer.valueOf(str.split(" ")[0]),Integer.valueOf(str.split(" ")[1]));
            }
            for (int i = 0; i < n; i++) {
                String str = scanner.nextLine();
                B[i] = new Point(Integer.valueOf(str.split(" ")[0]),Integer.valueOf(str.split(" ")[1]));
            }

            double minValue = Double.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double nowValue = getDe(A[i].x,A[i].y,B[j].x,B[j].y);
                    if ( nowValue < minValue){
                        minValue = nowValue;
                    }
                }
            }

            System.out.printf("%.3f\n",minValue);

            cishu--;
        }
    }

    public static double getDe(int x1,int y1,int x2,int y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}

class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
