package com.Array.Operations;

/**
 * Created by aksingh on 15-04-2017.
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.
 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 design an algorithm to find the maximum profit.

 */

public class BuySellStockProblem {

    Integer currentPrice = 0;
    Integer maxSellingProfit = 0;

    public BuySellStockProblem() {
    }
    public Integer findMaximumProfit(Integer shareArr[]){
        //Time Complexity O(n)

        Integer minSellingPrice = shareArr[0];
        for(Integer i= 1; i < shareArr.length; i++ ){
            currentPrice = shareArr[i];
            if (minSellingPrice > currentPrice){
                minSellingPrice = currentPrice;
            }

            if(currentPrice - minSellingPrice > maxSellingProfit) {
                maxSellingProfit = currentPrice - minSellingPrice;
            }
        }
        return maxSellingProfit;
    }
}
