package org.example.RepeatingQuestionString;

public class PalindromeCheckLogic {
    public static void main(String[] args) {
        String str = "Madam";
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] newString = clean.toCharArray();
        System.out.println(newString);
        int start = 0;
        int end = newString.length-1;
//
//        StringBuilder reversedBuilder = new StringBuilder();
//        for (int i = clean.length() - 1; i >= 0; i--) {
//            reversedBuilder.append(clean.charAt(i));
//        }
//
//        String reversed = reversedBuilder.toString();
        while(start<end){
            char temp = newString[start];
            newString[start]=newString[end];
            newString[end]=temp;
            start++;
            end--;
        }
        String reversed = new String(newString);
        System.out.println(reversed);
        if(reversed.equals(clean)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
