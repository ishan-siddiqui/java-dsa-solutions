package com.leetCodeQs;

// Link to Q - https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class LC_001_Two_Sum {
//    public static int[] twoSumOld(int[] nums, int target) {
////        Complexity of O(n^2)
//        int[] sum = new int[2];
//        for(int i=0; i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    sum[0] = i;
//                    sum[1] = j;
//                }
//            }
//        }
//        return sum;
//    }

    public static int[] twoSumNew(int[] arr, int target){
        //        Complexity of O(n)

        // We use hash table in this solution to look up values
        HashMap<Integer,Integer> table = new HashMap<>();

        for (int i = 0; i < arr.length; i+=1) {
            if (table.containsKey(target-arr[i])){return new int[] {table.get(target-arr[i]),i};}
            table.put(arr[i],i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {11,7,2,15};
        int target = 9;
        int[] ans = twoSumNew(arr,target);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
