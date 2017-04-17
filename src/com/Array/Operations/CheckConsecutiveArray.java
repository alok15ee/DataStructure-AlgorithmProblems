package com.Array.Operations;

import java.util.Arrays;

/**
 * Created by aksingh on 16-04-2017.
 */
public class CheckConsecutiveArray {

    public CheckConsecutiveArray() {
    }

    public boolean checkConsecutiveArray(Integer arr[]){

        //Time Complexity O(nlogn)
        //Space Complexity O(nlogn)
        Arrays.sort(arr); // Uses Dual-pivot Quicksort algorithm and has average case of O(nlogn) and space complexity of O(nlogn)
        Integer arrayLength = arr.length;
        System.out.println("ArrayLength:" +arrayLength);
        Integer min = arr[0];
        Integer max = arr[arrayLength-1];
        if((max - min) == arrayLength -1){
            return true;
        }

        return false;
    }

    public static void main(String arg[]){
        Integer iArr[] = {83, 78, 80, 81, 79, 82};
        CheckConsecutiveArray checkConsecutiveArray = new CheckConsecutiveArray();
        System.out.println(checkConsecutiveArray.checkConsecutiveArray(iArr));
    }
}
