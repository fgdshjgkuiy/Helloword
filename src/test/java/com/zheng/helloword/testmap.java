package com.zheng.helloword;

import java.util.HashMap;
import java.util.Map;

public class testmap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        get(map);
    }
    public static void get(Map map){
        System.out.println(map.get(1));
    }

}
