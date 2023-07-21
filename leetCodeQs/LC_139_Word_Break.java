package com.leetCodeQs;

import java.util.List;

// Link to Q - https://leetcode.com/problems/word-break/
public class LC_139_Word_Break {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];

        // Base Case
        dp[s.length()] = true;

        for (int i = s.length()-1; i > -1 ; i-=1) {
            for (String word : wordDict) {
                if ((i + word.length() <= s.length()) && (s.substring(i,i+word.length()).startsWith(word))) dp[i] = dp[i + word.length()];
                if (dp[i]) break; //resets the dict counter.. we start frm new index with reset wordDict sequence
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {

    }
}
