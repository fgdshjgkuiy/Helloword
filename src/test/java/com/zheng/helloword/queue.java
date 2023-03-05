package com.zheng.helloword;

import java.util.HashMap;
import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>( (o1, o2) -> o2-o1);
        queue.add(15);
        queue.add(2);
        HashMap<String,String> map =new HashMap<>();
        map.put("name","zhangsan");
        String n = map.get("name");

    }
}
