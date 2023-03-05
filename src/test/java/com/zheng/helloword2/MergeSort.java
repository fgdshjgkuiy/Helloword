package com.zheng.helloword2;

import java.util.Arrays;

public class MergeSort {

        public static void mergeSort(int[] arr){
            if(arr==null || arr.length<2){
                return;
            }
            process(arr,0,arr.length-1);
        }
        public static void process(int[] arr,int L,int R){
            if(L==R)return;

            int mid=(L+R)/2;
            process(arr,L,mid);
            process(arr,mid+1,R);
            merge(arr,L,mid,R);
        }
        public static void merge(int[] arr,int l,int m,int r){
            int[] help = new int[r-l+1];
            int i=0;
            int j=l;
            int k=m+1;
            while(j<=m && k<=r){
                help[i++]=arr[j]<=arr[k]?arr[j++]:arr[k++];
            }
            while(j<=m){
                help[i++]=arr[j++];
            }
            while(k<=r){
                help[i++]=arr[k++];
            }
            for(i=0;i<help.length;i++){
                arr[l+i]=help[i];
            }

        }


        public static void main(String[] args) {
            int[] array = {3, 5, 1, 2, 4};
            mergeSort(array);
            System.out.println(Arrays.toString(array));
        }
    }


