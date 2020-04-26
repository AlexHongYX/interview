package com.xiaoaxiao.kuaishou;

import java.util.Scanner;

/**
 * Created by xiaoaxiao on 2020/4/26
 * Description:
 */
public class postman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        Node[] nodes = new Node[1000000];
        for (int i = 0; i < n; i++) {
            String[] str = strings[i].split(" ");
            if (str.length == 4){
                int u = Integer.valueOf(str[1]);
                int v = Integer.valueOf(str[2]);
                int money = Integer.valueOf(str[3]);

                if (v == u*2){
                    nodes[u].first += money;
                }else if (v == u*2+1){
                    nodes[u].second += money;
                }
            }else {

            }
        }
    }
}

class Node{
    int first = 0;
    int second = 0;
    public Node(int f,int s){
        first = f;
        second = s;
    }
}
