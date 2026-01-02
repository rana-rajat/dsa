package org.example.RepeatingQuestionString;

import java.util.Arrays;

public class TwoStringAnagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        String s1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2 = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagrams");
                System.out.println(arr1);
                System.out.println(arr2);
            } else {
                System.out.println("Not Anagrams");
            }

        }

    }
}
