package com.Algorithms.BitManipulation;

public class xorFunction {
    public static int appearsOnce(int[] arr){
        int ans = 0;
        for (int number:arr) {
            ans ^= Math.abs(number);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,4,5,5,4};
        System.out.println("The only number which occurs once = " + appearsOnce(arr));
    }
}
