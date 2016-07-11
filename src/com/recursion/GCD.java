package com.recursion;

/**
 * Created by alok on 2/5/16.
 *
 * The Euclidean algorithm is a technique to quickly find the result of GCD of two numbers.
 * If A equlas to 0 and B!=0 then GCD is B and vice versa.
 * If A!=B!=0 then,
 * use recursion operation to get the result.
 * Divide firstNumber by second number remainder will be the second number and second number replaces the first number
 * where A = B*Q + R and the new call would be (B, R)
 */
public class GCD {

    private Integer gcd;
    private Integer newfirstNum;
    private Integer newsecondNum;

    public GCD(){

    }

    public Integer findGCD(Integer firstNum, Integer secondNum){



        if (firstNum == 0){
            return firstNum;
        }

        if (secondNum == 0){
            return secondNum;
        }
        else {

            newfirstNum= secondNum;
            newsecondNum = firstNum % secondNum;
            System.out.println(firstNum);
            System.out.println(secondNum);
            return findGCD(newfirstNum,newsecondNum);
        }

    }


}
