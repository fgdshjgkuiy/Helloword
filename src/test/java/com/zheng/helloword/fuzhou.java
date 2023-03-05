package com.zheng.helloword;

import java.util.ArrayList;
import java.util.Scanner;

public class fuzhou {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        int l = 1;

        while (n > 1) {
            for (int i = 0; i < list.size(); i++) {
                if (l == 3) {
                    list.remove(i);
                    i--;
                    n--;
                    l = 0;
                }
                l++;
            }
        }
        System.out.println("最后留下的是原来第" + list + "号");
    }
}
