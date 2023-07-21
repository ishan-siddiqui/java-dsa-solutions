package com.leetCodeQs;

// Link to Q - https://leetcode.com/problems/product-of-array-except-self/

public class LC_238_Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1; //prefix

        // prefix multiplication
        for(int i = 0; i < nums.length-1; i+=1){
            output[i+1] = output[i] * nums[i];
        }

        //postfix or suffix multiplication starting from end of array
        for(int i = nums.length-2; i >= 0; i-=1){
            output[i] *= nums[i+1];
            nums[i] *= nums[i+1];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
