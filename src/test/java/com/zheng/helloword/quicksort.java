package com.zheng.helloword;

public class quicksort {
    public static void quickRow(int[] array, int low, int high){
        int i,j,p;
        if (low >= high) {
            return;
        }
        i = low;
        j = high;
        p = array[low];
        while (i < j){
            while (array[j] >= p && i < j){
                j--;
            }
            while (array[i] <= p && i < j){
                i++;
            }
            if (i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[low] = array[i];
        array[i] = p;
        quickRow(array,low,i - 1);
        quickRow(array,i + 1,high);
    }
    public static void main(String[] args) {
        int[] array = {6,3,7,1,9,4,8,5,2,10,3};
        int low = 0,high = array.length - 1;
        quickRow(array,low,high);
        for (int i : array){
            System.out.println(i);
        }
    }


}
