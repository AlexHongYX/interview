package com.xiaoaxiao.bytedance;

/**
 * Created by xiaoaxiao on 2020/1/3
 * Description: http://www.baidu.com->com.baidu.www//:http
 */
public class URLReverse {
    private static String reverse(String url){
        char[] chars = url.toCharArray();
        StringBuilder sb = new StringBuilder();

        int end = chars.length;
        for (int i = chars.length-1; i >= 0; i--) {
            if(chars[i]<'a'||chars[i]>'z'){
                sb.append(url,i+1,end);
                end = i;
                sb.append(chars[i]);
            }
        }
        // 基于第一个符号(:)
        if (end!=0){
            sb.append(url,0,end);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("http://www.baidu.com"));
    }


}
