//package com.xiaoaxiao.alibaba;
//
//import java.util.Scanner;
//
///**
// * Created by xiaoaxiao on 2020/4/22
// * Description:
// */
//public class EatFish {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int T,D,X,N;
//        T = scanner.nextInt();
//        D = scanner.nextInt();
//        X = scanner.nextInt();
//        N = scanner.nextInt();
//        if (T < D){
//
//            for (int i = 1; i <= N; i++) {
//                System.out.println(eatFish1(T,D,X,i));
//            }
//        }else {
//            for (int i = 1; i <= N; i++) {
//                System.out.println(eatFish2(T,D,X,i));
//            }
//        }
//    }
//
//    private static int eatFish1(int t,int d,int x,int i){
//        // 走到门口 要吃的i条鱼都好了
//        // now表示走到门口的鱼的数量
//        if (d >= i*t){
//            return 2*d+i*x;
//        }else {
//            // 走过去 要吃的i条鱼只好了一部分
//            return 2*d+(d/t)*x+eatFish1(t,d,x,i-d/t);
//        }
//    }
//
//    private static int eatFish2(int t,int d,int x,int i){
//        if(t <= d*i){
//            return t*i+
//        }
//    }
//}
