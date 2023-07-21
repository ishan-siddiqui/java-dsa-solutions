package com.leetCodeQs;
// Link to Q -https://leetcode.com/problems/climbing-stairs/
public class LC_070_Climbing_Stairs {
    public static int climbStairs(int n) {
        if(n==1){return 1;} // edge case
        int[] mem = new int[n+1];
        for( int num : mem){ //initialise the array with -1 since we have not filled it any values yet
            num = -1;
        }
        mem[0] = 0;
        mem[1] = 1;
        mem[2] = 2;

        for (int i = 3; i < n+1; i+=1) {
            mem[i] = mem[i-1] + mem[i-2];
        }

        return mem[n];
    }

    public static void main(String[] args) {
        int ans = climbStairs(5);
        System.out.println(ans);
    }

}
