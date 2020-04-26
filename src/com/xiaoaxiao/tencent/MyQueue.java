package com.xiaoaxiao.tencent;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by xiaoaxiao on 2020/4/26
 * Description:
 */
public class MyQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    private int frontVal;

    public void push(int val){
        if (stack1.empty()){
            frontVal = val;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(val);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public boolean pop(){

        if (!stack1.empty()){
            stack1.pop();
            if (!stack1.empty()) {
                frontVal = stack1.peek();
            }
            return true;
        }
        return false;
    }

    public int peek(){
        if (!stack1.isEmpty()){
            return frontVal;
        }
        return -1;
    }

    public int size(){
        return stack1.size();
    }

    public void clear(){
        while (!stack1.isEmpty()){
            stack1.pop();
        }
        frontVal = 0;
    }

//    public static void main(String[] args) {
//        MyQueue myQueue = new MyQueue();
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.valueOf(scanner.nextLine());
//        while (n!=0){
//            String str = scanner.nextLine();
//            if (str.startsWith("add")){
//                int val = Integer.valueOf(str.split(" ")[1]);
//                myQueue.push(val);
//            }else if (str.startsWith("peek")){
//                System.out.println(myQueue.peek());
//            }else {
//                myQueue.pop();
//            }
//            n--;
//        }
//    }
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int ceshi = Integer.valueOf(scanner.nextLine());
    while (ceshi != 0){
        MyQueue myQueue = new MyQueue();
        Long n = Long.valueOf(scanner.nextLine());
        while (n!=0){
            String str = scanner.nextLine();
            if (str.startsWith("PUSH")){
                int val = Integer.valueOf(str.split(" ")[1]);
                myQueue.push(val);
            }else if (str.startsWith("TOP")){
                System.out.println(myQueue.peek());
            }else if (str.startsWith("POP")){
                if (!myQueue.pop()){
                    System.out.println("-1");
                }
            }else if (str.startsWith("SIZE")){
                System.out.println(myQueue.size());
            }else {
                myQueue.clear();
            }
            n--;
        }
        ceshi--;
    }

}
}



