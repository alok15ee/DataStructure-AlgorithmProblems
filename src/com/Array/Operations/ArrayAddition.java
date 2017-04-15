package com.Array.Operations;

/**
 * Created by aksingh on 10-04-2017.
 */
public class ArrayAddition {

    public Integer[] addTwoArray(Integer arr1[], Integer arr2[]){
        //Time Complexity O(n)
        //Space Complexity O(1)

        Integer sumArrLength = Math.max(arr1.length, arr2.length);
        Integer[] sumArr = new Integer[sumArrLength];
        Integer i = arr1.length -1;
        Integer j = arr2.length -1;
        Integer k = sumArr.length -1;
        Integer carry = 0;
        Integer value;
        Integer m;

        while (i >= 0 && j >= 0){
            value = arr1[i--] + arr2[j--] + carry;
            carry = value/10;
            //System.out.println("Quotient:" + value%10);
            sumArr[k--] = value%10;
        }
        while (i > j){
            value = arr1[i--] + carry;
            carry = value/10;
            sumArr[k--] = value%10;
        }
        while (j > i){
             value = arr2[j--] + carry;
             carry = value/10;
             sumArr[k--] = value%10;
         }

        for(m=0; m <= sumArr.length -1; m++){
            System.out.print(" " + sumArr[m]);
        }
        return sumArr;
    }

}
