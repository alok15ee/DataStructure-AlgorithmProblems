package com.Array.Operations;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by aksingh on 16-04-2017.
 * Write a function to determine if array contains duplicate elements within 'k' distance from each other
 */
public class DuplicateElements {

    boolean result = false;
    public DuplicateElements() {
    }

    //Non-optimized solution
    public boolean checkDuplicatesUnOptimized(Integer arr[], Integer k){

        //Time Complexity O(Kn)
        //Space Complexity O(1)
        for (Integer i=0; i < arr.length -1; i++){
            System.out.println(arr[i]);
            for (Integer j=i+1; j <= k; j++){
                if (arr[j] == arr[i]){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    //Optimized solution
    public boolean checkDuplicatesOptimized(Integer arr[], Integer k){
        //Time Complexity O(n)
        //Space Complexity O(1)
        Set<Integer> set = new HashSet<Integer>();
        for(Integer i = 0; i < arr.length -1; i++){
            if (set.contains(arr[i])){
                return true;
            }else {
                set.add(arr[i]);
            }
            // Remove the k+1 distant item
            if (i >= k){
                set.remove(arr[i-k]);
            }
        }
        return false;
    }

}
