package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/sum-of-two-integers/
public class LC_371_Sum_Of_Integers_Binary_Operators {
    public static int getSum(int num1, int num2) {
        while(num2!=0){
            int c = num1 & num2;
            num1 = num1 ^ num2;
            num2 = c << 1;
        }
        return num1;
    }
}
