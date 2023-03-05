package com.zheng.helloword;

public class testyin {
    public static void main(String[] args) {
        int ans=0;
        for(int i=1;i<=233;i++){
            int j=i;
            while(j!=0&&j%5==0){
                j=j/5;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
