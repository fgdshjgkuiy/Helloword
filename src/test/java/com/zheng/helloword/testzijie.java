package com.zheng.helloword;

import java.util.*;

public class testzijie {
    public static void main(String[] args) {
        int n=3;
        int[][] trust=new int[4][2];
        trust[0][0]=1;
        trust[0][1]=2;
        trust[1][0]=2;
        trust[1][1]=1;
        trust[2][0]=1;
        trust[2][1]=3;
        trust[3][0]=2;
        trust[3][1]=3;
        System.out.println(findProphet(n,trust));;

    }


        public static int findProphet(int n, int[][] trust) {
            Map<Integer,Set<Integer>> map = new HashMap<>();
            for(int i=0;i<trust.length;i++){
                map.putIfAbsent(trust[i][1],new HashSet<>());
                map.get(trust[i][1]).add(trust[i][0]);
            }




            Set<Integer> set = map.keySet();
            Iterator iter = set.iterator();
            while(iter.hasNext()){
                int i = (int)iter.next();
                if(map.get(i).size()==n-1){
                    boolean b = true;
                    Set<Integer> set1 = map.keySet();
                    Iterator iter1 = set1.iterator();
                    while(iter1.hasNext()){
                        int j = (int)iter1.next();
                        if(map.get(j).contains(i)){
                             b = false;
                        }
                    }
                    if(b){
                        return i;
                    }
                }
            }
            return -1;

    }
}
