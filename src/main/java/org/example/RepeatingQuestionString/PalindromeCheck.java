package org.example.RepeatingQuestionString;

public class PalindromeCheck {
   public static void main(String[] args) {
        String str = "Madam";
       // Convert to lowercase and remove non-alphanumeric characters (optional)
       String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       System.out.println(cleaned);
       if(cleaned.contentEquals(new StringBuilder(cleaned).reverse())){
           System.out.println("Palindrome");
       }else {
           System.out.println("Not Palindrome");
       }

    }
}
