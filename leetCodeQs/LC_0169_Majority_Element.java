package com.leetCodeQs;

import java.util.Hashtable;

// Leetcode:- https://leetcode.com/problems/majority-element/
public class LC_0169_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("Majority element of Array = "+majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int majElement = -1;
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < n; i += 1) {
            if (!table.containsKey(nums[i])){table.put(nums[i],1);}
            else {table.replace(nums[i], table.get(nums[i])+1);}
        }

        for (Integer key : table.keySet()){
            if (table.get(key) > n/2){return key;}
        }
            return majElement;
        }
}
