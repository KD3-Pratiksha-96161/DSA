package com.Q3;

public class InsertionSortDesc {
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 3};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }

       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}