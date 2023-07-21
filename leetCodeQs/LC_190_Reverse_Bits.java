package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/reverse-bits
public class LC_190_Reverse_Bits {
    public static int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i +=1){
            ans <<= 1;
            ans |= (n&1);
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
