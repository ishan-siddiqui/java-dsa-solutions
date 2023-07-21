package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class LC_121_Buy_Sell_Stock {
    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        int difference = 0; // difference between arr[value] and minimum will be compared with profit

        for (int i = 0; i < length; i+=1) {
            min = Math.min(min,prices[i]);
            difference = prices[i] - min;
            profit = Math.max(profit,difference);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max profit = " + maxProfit(prices));
    }
}
