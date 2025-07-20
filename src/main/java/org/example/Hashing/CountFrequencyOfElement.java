package org.example.Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfElement {

    public static void main(String[] args) {

        Integer[] arr = {2,3,4,2,3,2,45,5,3,4};
        Map<Integer,Integer> count = new HashMap<>();
        for(int value : arr){
            count.put(value,count.getOrDefault(value,0)+1);
        }

        for(Map.Entry<Integer,Integer> newMap :count.entrySet()){
            System.out.println("Element "+newMap.getKey()+" occurs " + newMap.getValue()+" times.");
        }
    }
}
