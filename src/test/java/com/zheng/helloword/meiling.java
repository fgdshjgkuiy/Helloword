package com.zheng.helloword;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class meiling {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i);
        }
        Iterator it = list.iterator();
        for(int i:list){
            if(i==3){
                it.remove();
            }
        }

    }
}
