package com.zheng.helloword;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class wudongtest {
    public static void main(String[] args) {
       String str = "a";
       System.out.println(str=="a");
       int i=1;
       wudongtest wu = new wudongtest();
       System.out.println(wu.help(i));
    }
    public int help(int i){
        return i;
    }
}
