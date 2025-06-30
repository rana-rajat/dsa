package org.example.RepeatingQuestionString;

public class CheckCharacterRepeats {
    public static void main(String[] args) {

        String str = "abcadfegasdx";
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()){
            if(!seen[ch]){
                seen[ch]= true;
            }else{
                System.out.println(ch+" is Repeating ");
            }
        }

    }
}
