package com.leetCodeQs;

import java.util.Arrays;

public class LC_0628_Max_Product_3_Nos {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println("Maximum product = " + maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n==3){return nums[0] * nums[1] * nums[2];}
        Arrays.sort(nums);
        int rightProduct = nums[n-1] * nums[n-2] * nums[n-3];
        int leftProduct = nums[0] * nums[1] * nums[2];
        if (rightProduct > leftProduct){return rightProduct;}
        return leftProduct;
    }
}
