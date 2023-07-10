package com.Algorithms.SlidingWindow;

public class SlidingWindow001 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        System.out.println("Maximum subarray = "+maximumOfSubArray(arr,k));
    }

    public static int maximumOfSubArray(int[] arr, int k){
        int max = 0;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i+=1){ max+=arr[i];}
        for (int i = k; i < n-k; i+=1){
            sum = sum - arr[i] + arr[i+k];
            if (sum > max){max = sum;}
        }
        return max;
    }
}
