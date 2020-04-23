package com.xiaoaxiao.meituan;

import java.util.*;

/**
 * Created by xiaoaxiao on 2020/4/23
 * Description:
 */
public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            set.add(arr[i]);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            for (Integer val : set){
                if ((arr[i] & val) == 0){
                    result[i] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
