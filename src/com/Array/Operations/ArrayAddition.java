package com.Array.Operations;

/**
 * Created by aksingh on 10-04-2017.
 */
public class ArrayAddition {

    public Integer[] addTwoArray(Integer arr1[], Integer arr2[]){

        Integer sumArrLength = Math.max(arr1.length, arr2.length);
        Integer[] sumArr = new Integer[sumArrLength];
        Integer i = arr1.length -1;
        Integer j = arr2.length -1;
        Integer k = sumArr.length -1;
        Integer carry = 0;

        while (i >= 0 && j >= 0){
            Integer value = arr1[i--] + arr2[j--] + carry;
            carry = value/10;
            //System.out.println("Quotient:" + value%10);
            sumArr[k--] = value%10;
        }
        while (i > j){
            Integer value = arr1[i--] + carry;
            carry = value/10;
            sumArr[k--] = value%10;
        }
        while (j > i){
             Integer value = arr2[j--] + carry;
             carry = value/10;
             sumArr[k--] = value%10;
         }

        for(Integer m=0; m <= sumArr.length -1; m++){
            System.out.print(" " + sumArr[m]);
        }
        return sumArr;
    }

}
