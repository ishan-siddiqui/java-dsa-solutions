package com.leetCodeQs;
// OPTIMAL SOLUTION FOR LEETCODE, SINCE RECURSIVE + MEMOIZATION SOLUTION NOT GOOD OPTION FOR LEETCODE
// Link to Q - https://leetcode.com/problems/longest-common-subsequence/

public class LC_1143_Longest_Common_Subsequence_DP {
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] t = new int[len1+1][len2+1];

        for (int i = 1; i < len1+1; i+=1) {
            for (int j = 1; j < len2+1; j+=1) {
                if (text1.charAt(i-1)==text2.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        return t[len1][len2];
    }

    public static void main(String[] args) {

        String text1 = "pmjghexybyrgzczy";
        String text2 = "hafcdqbgncrcbihkd";
        int len1 = text1.length();
        int len2 = text2.length();

        System.out.println(longestCommonSubsequence(text1,text2));

    }
}
