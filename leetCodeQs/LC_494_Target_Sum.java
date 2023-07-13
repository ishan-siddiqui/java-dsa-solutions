package com.leetCodeQs;

// Link to Q - https://leetcode.com/problems/target-sum/

import java.util.Arrays;

public class LC_494_Target_Sum {
    public static int findTargetSumWays(int[] arr, int target) {
        int n = arr.length;
        // new method to get sum of all integers in array in Java - Arrays.stream(arr).sum();

//      -----Extra base case not required-----
//        // base condition for n = 1
//        if (n==1)
//            return (Math.abs(target)==Math.abs(arr[0])) ? 1 : 0; //if target == n return 1, else return 0


        int sum = Arrays.stream(arr).sum();

        // Base condition for all exceptions - only one element, 0's involved, multiple 0's, etc.
        if (sum < Math.abs(target) || (sum + target) % 2 == 1) {
            return 0;
        }

        int addition = (sum + target) / 2;

        // count of subset sum with addition wala subset
        return countSubsetSum(arr,addition,n);
    }
    public static int countSubsetSum(int[] arr, int sum, int n) {
        int[][] t = new int[n+1][sum+1];

        // Initialising 1st row as 0
        for (int i = 0; i < t[0].length; i++) {
            t[0][i] = 0;
        }
        // Initialising 1st element as true
        t[0][0] = 1;

        // 0/1 Knapsack logic used in below code
        for (int i = 1; i <= n; i+=1) {
            for (int j = 0; j <= sum; j+=1) { //since we have to take care of {0,0,0,0,0,0,0,0,1} condition as well, we start frm first column and only initialise the first element
                if (arr[i-1] <= j){
                    t[i][j] = t[i-1][j - arr[i-1]] + t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[n][sum];

    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,1};
        int target = 1;
        System.out.println("Number of expressions = " + findTargetSumWays(arr,target));
    }
}
