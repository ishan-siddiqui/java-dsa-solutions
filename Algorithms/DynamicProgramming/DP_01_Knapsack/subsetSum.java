package com.Algorithms.DynamicProgramming.DP_01_Knapsack;

import java.util.Arrays;

public class subsetSum {
    public static boolean[] subsetSum(int[] arr, int sum, int n) {
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
        // returning last row of subset sum
        return t[n];
    }

    public static void main(String[] args) {
        int[] arr = {2,-1,0,4,-2,-9};
        int n = arr.length;
        int sum = Arrays.stream(arr).sum();
        System.out.println("subset possible = " + subsetSum(arr,sum,n));
    }
}
