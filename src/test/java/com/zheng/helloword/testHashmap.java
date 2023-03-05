package com.zheng.helloword;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class testHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        map.put(18,18);
        map.put(17,17);
        map.put(16,16);
        map.put(15,15);
        map.put(14,14);
        for(int key:map.keySet()){
            System.out.println(key+"and"+map.get(key));
        }
    }
}
