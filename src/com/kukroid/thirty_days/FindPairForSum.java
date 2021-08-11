package com.kukroid.thirty_days;

import java.util.HashMap;

public class FindPairForSum {
    /*
    * arr = [8, 7, 2, 5, 3, 1]
    * sum = 10
    *
    *
    * Output:
    *
    * Pair found (8, 2)
    * or
    * Pair found (7, 3)
    * */

    public static void main(String[] args) {
        int[] arr_input = {8, 7, 2, 5, 3, 1};
        findPair(arr_input);
    }


    public static void findPair(int[] arr) {
        int sum = 10;
        HashMap<Integer,Integer> hashmap = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(hashmap.containsKey(sum - arr[i])) {
                System.out.println("Pair Found: "+arr[hashmap.get(sum - arr[i])] + "," + arr[i] );
            }
            hashmap.put(arr[i],i);
        }
    }
}
