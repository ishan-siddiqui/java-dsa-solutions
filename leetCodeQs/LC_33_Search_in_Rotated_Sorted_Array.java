package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/search-in-rotated-sorted-array/
public class LC_33_Search_in_Rotated_Sorted_Array {
    public static int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        // Binary search
        while (l <= r){

            int mid = l + (r - l) / 2;
            if (arr[mid] == target){return mid;}

            // Left sorted array
            if (arr[l] <= arr[mid]){
                if (target < arr[l] || target > arr[mid]){l = mid + 1;} // target is in other array
                else {r = mid - 1;}
            }
            else{// Right Sorted Array
                if (target > arr[r] || target < arr[mid]){r = mid - 1;} // target is in other array
                else l = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println("Minimum in Rotated Sorted Array = " + search(arr,target));
    }
}
