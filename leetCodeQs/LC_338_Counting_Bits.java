package com.leetCodeQs;

public class LC_338_Counting_Bits {
    public static int[] countBits(int n){
        int[] dp = new int[n+1];
        int offset = 1; // 2 ^ x = 1,2,4,8,...

        for(int i = 1; i < n+1; i +=1){
            if (offset * 2 == i) offset = i; //set new offset
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
