package org.example.Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static int[] twoSum(int[] numb, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numb.length; i++) {
            int complement = target - numb[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(numb[i], i);
            System.out.println("Map after inserting " + numb[i] + ": " + map);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] numb = {3, 7, 9, 4};
        int target = 11;

        int[] result = twoSum(numb, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

}


