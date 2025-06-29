package org.example.RepeatingQuestionString;

import java.util.LinkedHashSet;

public class DuplicateString {
    public static void main(String[] args) {

        String input = "aabcdsaaefgas";

        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> characters = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            if (characters.add(c)) {
                result.append(c);
            }
        }
        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
    }

}
