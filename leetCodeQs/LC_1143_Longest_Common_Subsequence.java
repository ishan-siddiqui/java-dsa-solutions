package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/longest-common-subsequence/
import java.util.Arrays;

public class LC_1143_Longest_Common_Subsequence {
    static int[][] t = new int[1001][1001];


    public static int longestCommonSubsequence(String text1, String text2, int m, int n) {


        // Base condition for recursion
        if (m == 0 || n == 0) return 0;
        if (t[m][n] != -1) return t[m][n];

        if (text1.charAt(m-1) == text2.charAt(n-1)) return (1 + longestCommonSubsequence(text1, text2, m-1, n-1));
        else return Math.max(longestCommonSubsequence(text1, text2, m, n-1), longestCommonSubsequence(text1, text2, m-1, n));

    }
    public static void main(String[] args) {

        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                t[i][j] = -1;
            }
        }
        String text1 = "pmjghexybyrgzczy";
        String text2 = "hafcdqbgncrcbihkd";
        int len1 = text1.length();
        int len2 = text2.length();

        System.out.println(longestCommonSubsequence(text1,text2,len1,len2));
    }
}
