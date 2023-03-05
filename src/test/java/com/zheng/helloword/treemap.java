package com.zheng.helloword;

import java.util.*;

public class treemap {
    public static void main(String[] args) {
       Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            String s= i+"";
            map.put(s,s);
            System.out.println(s);
        }
    }
}
