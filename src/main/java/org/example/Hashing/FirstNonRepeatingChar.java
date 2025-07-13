package org.example.Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static Character findFirstNonRepeatingChar(String str){
        Map<Character,Integer> charCount = new LinkedHashMap<>();
        //count frequency of each character
        for(char ch : str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        //Find the first character with frequency 1
        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }return null;
    }

    public static void main(String[] args) {
        String str = "swiss";

        Character result = findFirstNonRepeatingChar(str);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
