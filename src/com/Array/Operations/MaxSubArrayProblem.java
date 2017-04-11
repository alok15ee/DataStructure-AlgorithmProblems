package com.Array.Operations;

/**
 * Created by alok on 16/5/16.
 *
 * The max­i­mum sub­ar­ray prob­lem is the task of finding the contiguous
 * sub-array within a one-dimensional array of numbers which has the largest sum.
 *
 */
public class MaxSubArrayProblem {

    Integer maxSum = Integer.MIN_VALUE;
    Integer sum = 0;

    //Complexixity O(n^2)
    public void findMaxSubArray(Integer arr[]){

        for (int i=0; i < arr.length ;i++){   //n

            sum = arr[i];
            for (int j=i+1; j < arr.length ;j++){ //(n-1) + (n-2) + (n-3)+.....+1
                sum +=  arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max sum of a sub array :" + maxSum);

    }

    public int findMaxSubArrayDQ(Integer arr[], int low  , int high){

        int maxLeftBorderSum =0 , maxRightBorderSum = 0;
        int leftBorderSum = 0, rightBorderSum = 0;

        int mid = (low+high)/2;

        if (high == low){
            return arr[ low ] > 0 ? arr[ low ] : 0;
        }
        int leftMaxSum = findMaxSubArrayDQ(arr, low, mid);
        int rightMaxSum = findMaxSubArrayDQ(arr,mid+1, high);

        for( int i = mid; i >= low; i-- )
        {
            leftBorderSum += arr[ i ];
            if( leftBorderSum > maxLeftBorderSum )
                maxLeftBorderSum = leftBorderSum;
        }

        for( int i = mid + 1; i <= high; i++ )
        {
            rightBorderSum += arr[ i ];
            if( rightBorderSum > maxRightBorderSum )
                maxRightBorderSum = rightBorderSum;
        }
/*
        return max3( leftMaxSum, rightMaxSum,
                maxLeftBorderSum + maxRightBorderSum );*/

        int recResultSumMax = Math.max(leftMaxSum, rightMaxSum);
        return Math.max(recResultSumMax, maxLeftBorderSum + maxRightBorderSum);

    }
   /* private static int max3( int a, int b, int c )
    {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }*/
}




