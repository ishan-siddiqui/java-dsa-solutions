package com.leetCodeQs;
// SOLUTION PENDING
//Link to Q: https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/

import java.util.stream.*;
import java.util.Arrays;
public class LC_2035_Min_Subset_Sum_Difference {
    // Minimize |S1 - S2| = = Minimize |S2 - S1| = Minimize |Range - S1 - S1| = Minimize | Range - 2S1| = Maximize S1
    public static int minimumDifference(int[] arr) {
        int n = arr.length;
        // range shall vary from 0 to sum of all numbers in Array
        int range = Math.abs(IntStream.of(arr).sum());

        //perfom subsetSum operation and return last row of the dp table
        boolean[] subSum = subsetSum(arr, range, n);

        int[] v = new int[range/2];

        //getting the vector of all possible subsets S1
        for (int i = 0; i < range/2; i++) {
            if (subSum[i]){v[i] = i;}
        }
//        for (int i = 0; i < v.length; i +=1)
//            System.out.print(v[i]+",");
//        System.out.println();

        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < v.length; i+=1)
            mn = Math.min(mn,range - 2 * v[i]);
        return mn;
    }
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
        System.out.println("Minimum possible absolute difference = " + minimumDifference(arr));
    }
}
