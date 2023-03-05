package com.zheng.helloword;

public class quicksortme {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        int left = 0,right = arr.length - 1;
        quickRow(arr,left,right);
        for (int i : arr){
            System.out.println(i);
        }
    }
    public static void quickRow(int[] arr,int left,int right){
        if(left>=right) return;
        int l=left;int r=right;
        int p=arr[r];
        while(l<r){
            if(arr[l]>p){
                swap(arr,l,r);
                r--;
            }else{
                l++;
            }
        }
        quickRow(arr,left,l);
        quickRow(arr,l+1,right);
    }

    private static void swap(int[] arr, int l, int r) {
        int k=arr[l];
        arr[l]=arr[r];
        arr[r]=k;
    }
}
