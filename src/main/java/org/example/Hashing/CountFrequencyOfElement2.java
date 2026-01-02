package org.example.Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElement2 {
    public static void main(String[] args) {
        String str = "abbccdaab";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}
