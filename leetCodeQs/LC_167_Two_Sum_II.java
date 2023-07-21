package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class LC_167_Two_Sum_II {
    public static int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = arr.length - 1;

        // 2 pointer approach
        while (left <= right){
            if (arr[left] + arr[right] == target) return new int[] {left+1, right+1};

            if (arr[left] + arr[right] > target){right -= 1;} //sum > target, we need to decrease sum by reducing number r-1 is smaller number since array is sorted in ascending order
            else left +=1; // sum < target, increase sum by moving left pointer ahead
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,11};
        int[] ans = twoSum(arr, 9);
        for (int index : ans) {
            System.out.print(index + " ");
        }
    }
}
