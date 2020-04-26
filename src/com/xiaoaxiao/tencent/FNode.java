package com.xiaoaxiao.tencent;

import java.util.Scanner;

/**
 * Created by xiaoaxiao on 2020/4/26
 * Description:
 */
public class FNode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        while (n != 0){

            String str = scanner.nextLine();
            int val = Integer.valueOf(str.split(" ")[0]);
            int k = Integer.valueOf(str.split(" ")[1]);

            System.out.println(getKLevel(val,k));
            n--;
        }
    }

    public static long getKLevel(long val,int k){
        int nowK = getK(val);
        if (nowK <= k){
            return -1;
        }
        long ret = val;
        int row = nowK-k;
        while (row!=0){
            ret /= 2;
            row--;
        }
        return ret;

    }

    public static int getK(long val){
        int ret = 0;
        while (val != 0){
            ret++;
            val /= 2;
        }
        return ret;
    }
}
