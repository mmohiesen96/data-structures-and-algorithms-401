package com.company;

import java.util.Arrays;

public class Main {
    public void mergeSort(int[] arr) {
        int n = arr.length;

        if (n > 1) {
            int mid = n/2;
            int[] left = Arrays.copyOfRange(arr , 0 , mid);

            int[] right = Arrays.copyOfRange(arr , mid , n);
            mergeSort(left);
            mergeSort(right);
            merge(left , right , arr);
        }
    }

    public void merge(int[] left ,int[] right , int[] arr) {
        int i = 0, j  = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }

            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        if(i == left.length) {
            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
        else {
            while (i < left.length) {
                arr[k++] = left[i++];
            }
        }
    }
    public static void main(String[] args) {
	    int arr[] = {1,2,3,18,4,19,2,16,17,2};
	    Main main = new Main();
	    main.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
