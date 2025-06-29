package org.example.RepeatingQuestionsArray;

public class LargestAndSecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 3, 19, 8, 47, 30};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + (secondMax != Integer.MIN_VALUE ? secondMax : "Not found"));
    }
}
