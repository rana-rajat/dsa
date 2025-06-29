package org.example.RepeatingQuestionsArray;

import java.util.*;

public class RemoveDuplicatesInteger {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 4, 3, 3, 5, 6};

        Set<Integer> result = new HashSet<>();
        List<Integer> seen = new ArrayList<>();

        for (int num : arr) {
            if (result.add(num)) {
                seen.add(num);
            }
        }
        // Convert list back to array if needed
        int[] newListOfArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newListOfArray[i] = seen.get(i);
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Without duplicates: " + Arrays.toString(newListOfArray));
    }
}
