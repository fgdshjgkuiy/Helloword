package com.zheng.helloword;

public class quicksortwu {
        public static int quickRow(int[] arr,int left,int right){
            int num = arr[left];
            while(left<right){
                while(left < right && arr[right] >= num) --right;
                arr[left] = arr[right];
                while(left < right && arr[left] <= num) ++left;
                arr[right] = arr[left];
            }
            arr[left] = num;
            return left;
        }
        public static void quickSort(int[] arr, int left, int right){
            if(left < right){
                int pos = quickRow(arr,left,right);
                quickSort(arr,left,pos-1);
                quickSort(arr,pos+1,right);

            }
        }
        public static void main(String[] args) {
            int[] arr = {3,1,4,5,2};
            int left = 0,right = arr.length - 1;
            quickSort(arr,left,right);
            for (int i : arr){
                System.out.print(i+"\t");
            }
        }
    }

