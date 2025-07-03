package org.example.RepeatingQuestionString;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] newStr = str.toCharArray();
        int start=0;
        int end=newStr.length-1;
        while(start<end){
            char temp=newStr[start];
            newStr[start]=newStr[end];
            newStr[end]= temp;
            start++;
            end--;

        }
        String reversed = new String(newStr);
        System.out.println("Reversed string: " + reversed);

    }
}
