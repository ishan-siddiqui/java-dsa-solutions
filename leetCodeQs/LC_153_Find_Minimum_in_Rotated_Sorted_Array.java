package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class LC_153_Find_Minimum_in_Rotated_Sorted_Array {

    public static int findMin(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        // Binary search
        while (l <= r){

            if (arr[l] <= arr[r]){return arr[l];}

//            int m = (l + r) / 2;
            int mid = l + ((r - l) / 2); //Optimised for bigger numbers
            System.out.println(mid);
            if (arr[mid] >= arr[l]){l = mid + 1;}

            else{r = mid;}
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println("Minimum in Rotated Sorted Array = " + findMin(arr));
    }
}
