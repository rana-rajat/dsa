package org.example.RepeatingQuestionsService;

public class LargestAndSecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 3, 19, 8, 47,30};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        System.out.println("Initial max = " + max + ", secondMax = " + secondMax);
        System.out.println("Starting loop...\n");

        for (int num : arr) {
            System.out.println("Current number: " + num);
            if (num > max) {
                secondMax = max;
                max = num;
                System.out.println("  → New max found! Updated max = " + max + ", secondMax = " + secondMax);
            } else if (num > secondMax && num != max) {
                secondMax = num;
                System.out.println("  → Updated secondMax = " + secondMax);
            } else {
                System.out.println("  → No update");
            }
        }

        System.out.println("\nFinal result:");
        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + (secondMax != Integer.MIN_VALUE ? secondMax : "Not found"));
    }
}
