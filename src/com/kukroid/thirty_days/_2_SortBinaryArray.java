package com.kukroid.thirty_days;

public class _2_SortBinaryArray {


    /*
    * Sort binary array in linear time and constant space
    * Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }
    *
    * Output: { 0, 0, 0, 0, 1, 1, 1, 1 }
    * */

    public static void main(String[] args) {
        int[] input = { 1, 0, 1, 0, 1, 0, 0, 1 };
        printArr(input);
        //sortApproach1(input);
        sortApproach2(input);
    }

    public static void sortApproach1(int[] arr) {
        int pivot = 0;
        int j = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > pivot) {
                swap(arr, i ,j);
                j++;
            }
        }
        printArr(arr);
    }

    public static void sortApproach2(int[] arr_input) {

        int count0 = 0;
        for(int i : arr_input) {
            if(i==0) {
                count0++;
            }
        }
        for(int i =0;i<count0;i++) {
            arr_input[i] =0;
        }
        for(int i = count0+1 ;i < arr_input.length;i++) {
            arr_input[i]=1;
        }
        printArr(arr_input);
    }

    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");

        }
        System.out.println("");
    }
}
