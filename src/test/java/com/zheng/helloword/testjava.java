package com.zheng.helloword;

import java.util.HashSet;
import java.util.Set;

public class testjava {
    public static void main(String[] args) {
        Set<Short> set = new HashSet<>();
        for(short i=0;i<100;i++){
            set.add(i);
            set.remove(i-1);
        }
        System.out.println(set.size());
    }
}
