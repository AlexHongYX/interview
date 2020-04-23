package com.xiaoaxiao.meituan;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by xiaoaxiao on 2020/4/23
 * Description:
 */
public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();

            if (str.contains(".")){
                String[] strs = str.split("\\.");
                if (strs[1].length()>=2){
                    str = strs[0] +"."+ strs[1].substring(0,2);
                }else{
                    str = strs[0] +"."+ strs[1].charAt(0)+"0";
                }
            }else {
                str = str + ".00";
            }

            boolean isFu = false;
            if (str.contains("-")){
                str = str.substring(1);
                isFu = true;
            }

            // 12344.1


            String[] strs = str.split("\\.");
            str = add(strs[0])+"."+strs[1];


            str = "$"+str;

            if (isFu){
                str = "("+str+")";
            }

            System.out.println(str);
        }
    }

    private static String add(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            stack.push(str.charAt(i));
            sum++;
            if (sum == 3&&i!=0){
                stack.push(',');
                sum = 0;
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
