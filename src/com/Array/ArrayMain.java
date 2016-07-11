package com.Array;

import com.Array.Operations.MaxSubArrayProblem;

/**
 * Created by root on 16/5/16.
 */
public class ArrayMain {

    public static void main(String arg[]){
        MaxSubArrayProblem maxSubArrayProblem = new MaxSubArrayProblem();
        Integer[] arr = {-2, 1, -3, 4};

        //maxSubArrayProblem.findMaxSubArray(arr);
        int maxSum = maxSubArrayProblem.findMaxSubArrayDQ(arr, 0 ,arr.length-1);
        System.out.println("Max SubArray Sum:" + maxSum);
    }
}
