package com.xiaoaxiao.kuaishou;

import java.util.*;

/**
 * Created by xiaoaxiao on 2020/4/26
 * Description:
 */
public class url {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        String[] urls = new String[n];
        Map<String,HashSet<String>> allUrl = new HashMap<>();

        for (int i = 0; i < n; i++) {
            urls[i] = scanner.nextLine();
            String val;
            if (urls[i].contains("/")) {
                val = urls[i].split("//")[1].split("/")[0];
                val = urls[i].split("//")[0] + val;
            } else {
                val = urls[i];
            }
            if (allUrl.containsKey(val)){
                HashSet<String> set = allUrl.get(val);
                set.add(urls[i]);
                allUrl.put(val,set);
            }else {
                HashSet<String> set = new HashSet<>();
                set.add(urls[i]);
                allUrl.put(val,set);
            }
        }


        Map<Integer,List<String>> result = new HashMap<>();

        // 保存所有域名下面其请求集合的集合
        for (Map.Entry<String,HashSet<String>> entry : allUrl.entrySet()){
            int size = entry.getValue().size();
            if (result.containsKey(size)){
                List<String> list = result.get(size);
                list.add(entry.getKey());
                result.put(size,list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey());
                result.put(size,list);
            }
        }

        for (Map.Entry<Integer,List<String>> entry:result.entrySet()){
            if (entry.getValue().size() == 1){
                result.remove(entry.getKey());
            }
        }

        System.out.println(result.size());
        for (Map.Entry<Integer,List<String>> entry:result.entrySet()){
            for (String val : entry.getValue()){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}


