package com.zheng.helloword;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class zhiyinshu {

    private static String baseString;

    public void primeNum(int n, int m, String result) {
        if (n < m)
            baseString = result;
        else {
            if (n % m == 0) {
                primeNum(n / m, m, result + m + " ");
            } else
                primeNum(n, m + 1, result);
        }
    }

    public String getKinds(String result) {
        String[] tmp = result.split(" ");
        String target = "";
        TreeSet set = new TreeSet();
        for (int i = 0; i < tmp.length; i++) {
            set.add(Integer.valueOf(tmp[i]));
        }
        Iterator it = set.iterator();
        for (int i = 0; i < set.size(); i++)
            target += (Integer) it.next() + " ";
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new zhiyinshu().primeNum(n, 2, "");
        System.out.println("所有质因子的列表 :" + baseString);
        System.out.println("所有质因子的种类 :" + new zhiyinshu().getKinds(baseString));
    }
}

