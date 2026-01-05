package org.example.RepeatingQuestionString;

import java.util.HashSet;
import java.util.Set;

public class CheckCharacterRepeats {
    public static void main(String[] args) {

        String str = "abcadfegasdx";
        boolean[] seen = new boolean[256];

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
            } else {
                System.out.println(ch + " is Repeating ");
            }
        }
        //Also my way
        Set<Character> newStr = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (newStr.contains(ch)) {
                System.out.println(ch + " is Repeating ");
            } else {
                newStr.add(ch);
            }
        }

    }
}
