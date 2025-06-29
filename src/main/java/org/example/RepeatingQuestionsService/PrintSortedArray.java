package org.example.RepeatingQuestionsService;

import java.util.Arrays;

public class PrintSortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1};

        System.out.println("Unsorted array: " + Arrays.toString(arr));

        // Manual sorting (Bubble sort)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
        }
}
