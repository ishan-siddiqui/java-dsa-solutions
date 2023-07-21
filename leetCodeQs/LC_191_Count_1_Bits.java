package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/number-of-1-bits/
public class LC_191_Count_1_Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n = n & (n-1);
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;

    }


}
