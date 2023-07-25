package com.leetCodeQs;

import java.util.Arrays;

// Link to Q - https://leetcode.com/problems/decode-ways/
public class LC_91_Decode_Ways {
    public static int numDecodingsRecursive(String s) {
        // Base Case
        if (s.length() == 1) return 1;

        int [] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        int i = 0;


//         static int dfs(int i) {
//            // Base condition, value already exits, then return that value OR last position
//            if(dp[i]!=-1) return dp[i];
//
//            if (s.charAt(i)=='0') return 0; // invalid String, cannot start with 0
//
//            int res = dfs(i+1);
//
//            if ( ((i+1) < s.length()) && ( (s.charAt(i) == '1' || s.charAt(i) == '2') &&
//                    (s.charAt(i + 1) >= '1' && s.charAt(i + 1) <= '6') ) )
//                res += dfs(i+2);
//            dp[i] = res;
//            return res;
//        }
//
//        return dfs(i);
        return 0;

    }

    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i < n + 1; i+=1) {
            if (s.charAt(i - 1)!= '0') dp[i] += dp[i - 1];
            if ( (s.charAt(i - 2) == '1') ||
                    (s.charAt(i - 2) == '2' && (s.charAt(i - 1) < '7')) ) dp[i] += dp[i - 2];
        }
        return  dp[n];
    }



    public static void main(String[] args) {

        System.out.println(numDecodings("10"));
    }
}
