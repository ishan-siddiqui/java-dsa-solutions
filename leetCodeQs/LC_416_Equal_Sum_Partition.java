package com.leetCodeQs;

//Link to Q: https://leetcode.com/problems/partition-equal-subset-sum/

import java.util.Arrays;

public class LC_416_Equal_Sum_Partition {
    public static boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;
        //get sum of all Array elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // if sum is odd, then equal sum partition not possible
        if (sum % 2 != 0){return false;}
        // else if sum is even, so we check subSet Sum true or not for sum/2 for optimization purpose
        else
            return subsetSum(arr,sum/2,n);

    }
    public static boolean subsetSum(int[] arr, int sum, int n) {
        boolean[][] t = new boolean[n+1][sum+1];

        // Initialising 1st row as false
        for (int i = 0; i < t[0].length; i++) {
            t[0][i] = false;
        }
        // Initialising 1st column as true
        for (int i = 0; i < t.length; i++) {
            t[i][0] = true;
        }

        // 0/1 Knapsack logic used in below code
        for (int i = 1; i <= n; i+=1) {
            for (int j = 1; j <= sum; j+=1) {
                if (arr[i-1] <= j){
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5};
        System.out.println(canPartition(arr));
    }

}
