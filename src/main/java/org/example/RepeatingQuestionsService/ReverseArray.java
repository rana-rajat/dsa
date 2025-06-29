package org.example.RepeatingQuestionsService;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
      int start= 0;
      int end = arr.length-1;

      while(start<end){
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end]=temp;

          start++;
          end--;
      }
    }

    public static void main(String[] args) {
//        int[] are = {1, 2, 3, 4, 5};
//        this is only print, but it doesn't actually reverse the array in memory (not in-place).
//        for (int i = are.length - 1; i >= 0; i--) {
//            System.out.println(are[i]);
//        }

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

}
