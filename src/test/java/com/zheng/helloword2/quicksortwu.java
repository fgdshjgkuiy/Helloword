package com.zheng.helloword2;

import java.util.Scanner;

public class quicksortwu {
    public static void main(String[] args) {

        long n=180;
        long ans=1L;
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                System.out.print(i+" ");
                int exp=0;
                while(n%i==0) {
                    n/=i;
                    exp++;

                }
                if(exp%2!=0) {
                    ans*=i;
                }
            }
        }
        if(n==1) System.out.println();
    			else System.out.print(n+" ");
        char c='F';
        if(c=='F'){
            System.out.println("=========");
        }
    }




}

