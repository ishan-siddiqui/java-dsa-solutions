package com.Algorithms.BitManipulation;

public class magicNumber {
    public static int magicNum(int n){
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n >>= 1; // n = n >> 1;
            ans += base*last;
            base *= 5;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Magic number for " + n + " = " + magicNum(n));
    }
}
