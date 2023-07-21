package com.leetCodeQs;

public class LC_213_House_Robber_II {
    public static int rob2(int[] nums) {
        // Base condition
        if(nums.length==1) return nums[0];

        return Math.max(rob(nums,0,nums.length-2), rob(nums,1,nums.length-1));
    }
    public static int rob(int[] nums, int start, int end) {
        int rob1 = 0;
        int rob2 = 0;
        for(int i = start; i < end + 1; i +=1){

            int temp = Math.max(nums[i] + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob2(nums));
    }
}
