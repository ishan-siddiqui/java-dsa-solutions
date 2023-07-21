package com.leetCodeQs;

public class LC_198_House_Robber {

    public static int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        for(int num : nums){
            int temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
