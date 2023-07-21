package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/maximum-product-subarray/
public class LC_152_Max_Product_Subarray {
    public static int maxProduct(int[] arr) {
        if (arr.length == 1) return arr[0];

        int res = arr[0];
        int max = 1;
        int min = 1;

        for (int n : arr){
            int tmp = max * n;
            max = Math.max(n , Math.max(tmp , min * n));
            min = Math.min(n , Math.min(tmp , min * n));
            res = Math.max(res , max);
        }

        return res;

    }
    public static void main(String[] args) {
        int[] arr = {0,2};
        System.out.println("Maximum product in subarray = "+maxProduct(arr));
    }
}
