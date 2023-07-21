package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/maximum-subarray/
public class LC_053_Maximum_Subarray {
    public static int maxSubArray(int[] arr) {
        if (arr.length==1){return arr[0];}
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            sum += num;
            max = Math.max(max,sum);
            // if sum becomes -ve due to ove nos, we reset our sliding window and move on to next sub-array
            if (sum < 0){sum = 0;}
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum = "  + maxSubArray(arr));
    }
}
