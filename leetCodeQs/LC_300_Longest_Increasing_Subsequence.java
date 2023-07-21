package com.leetCodeQs;

import java.lang.reflect.Array;
import java.util.Arrays;

// Link to Q - https://leetcode.com/problems/longest-increasing-subsequence/
public class LC_300_Longest_Increasing_Subsequence {
    public static int lengthOfLIS(int[] nums) {
        // Base condition
        if (nums.length==1)return 1;

        int[] LIS = new int[nums.length];
        Arrays.fill(LIS,1); // filling all array s with 1 for the (1 , 1 + LIS[i+1]) logic, since all paths have at least one length
        int max = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >=0; i -=1){
            for (int j = i + 1; j < nums.length; j+=1) {
                if (nums[i] < nums[j]) LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
            }
            max = Math.max(max,LIS[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println("The Longest Increasing Subsequence = " + lengthOfLIS(nums));
    }
}
