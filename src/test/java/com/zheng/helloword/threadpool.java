package com.zheng.helloword;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class threadpool {
    public static void main(String[] args) {
        Executors.newFixedThreadPool(5);
        
    }
}
