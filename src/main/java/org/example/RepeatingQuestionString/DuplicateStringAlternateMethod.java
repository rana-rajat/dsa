package org.example.RepeatingQuestionString;

public class DuplicateStringAlternateMethod {
    public static void main(String[] args) {
        String str = "abcadfegasdx";
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()){
            int index = ch - 'a';
            if(!seen[index]){
                seen[index]=true;
                result.append(ch);
            }
        }
        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result);
    }

}
