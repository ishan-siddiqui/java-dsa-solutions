package com.leetCodeQs;

import java.util.Arrays;

// Link to Q - https://leetcode.com/problems/coin-change/
public class LC_322_Coin_Change {
    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] t = new int[n+1][amount+1];
        // Initialising tha dp table
        for (int i = 0; i < amount+1; i+=1) t[0][i] = Integer.MAX_VALUE - 1;
        for (int i = 0; i < n+1; i+=1) t[i][0] = 0;

        for (int j = 1; j < amount+1; j+=1) {
            if (j % coins[0]  == 0) t[1][j] = j / coins[0];
            else t[1][j] = Integer.MAX_VALUE - 1;
        }

        for (int i = 2; i < n+1; i+=1) {
            for (int j = 1; j < amount+1; j++) {
                if (coins[i-1] <= j) t[i][j] = Math.min(t[i-1][j], (t[i][j - coins[i-1]] + 1));
                else t[i][j] = t[i-1][j];
            }
        }
        // if no ans, we should replace max_value with -1 as per leetcode requirements
        if (t[n][amount] >= Integer.MAX_VALUE - 1){return -1;}
        return t[n][amount];
    }

    public static int coinChange1DP(int[] coins, int amount) {
        if (amount < 0 || coins.length == 0 || coins == null) {
            return 0;
        }
        int[] dp = new int[amount+1];
        // initialise all values with INT_MAX
        Arrays.fill(dp, amount + 1);

        int n = coins.length;
        // base case
        dp[0] = 0;
        for (int a = 1; a < amount+1; a +=1){
            for (int coin : coins) {
                if (a - coin >= 0) dp[a] = Math.min(dp[a], 1 + dp[a-coin]);
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }



    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println("fewest number of coins that you need to make up the amount " + amount + " = " + coinChange(coins,amount));
    }
}
