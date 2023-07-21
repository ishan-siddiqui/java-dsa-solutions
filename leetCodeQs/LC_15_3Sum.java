package com.leetCodeQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Link to Q - https://leetcode.com/problems/3sum/
public class LC_15_3Sum {
    public static List<List<Integer>> threeSum(int[] arr) { //target = 0
        Arrays.sort(arr);
        LinkedList<List<Integer>> ans = new LinkedList<List<Integer>>();
        // 2 pointer 2 sum II method
        for (int i = 0; i < arr.length - 2; i += 1) {
            // only proceed if there are no duplicates, first element of array is exception
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])){
                int left = i + 1;
                int right = arr.length - 1;
                int target = 0 - arr[i];

                while (left < right) {
                    if (arr[left] + arr[right] == target) {
                        // if solution exists, add the elements to linked list
                        ArrayList<Integer> newAns = new ArrayList<>();
                        newAns.add(arr[i]);
                        newAns.add(arr[left]);
                        newAns.add(arr[right]);
                        ans.add(newAns);

                        // now iterate pointers to prevent duplicate values
                        while (left < right && arr[left] == arr[left + 1]) left += 1;
                        while (left < right && arr[right] == arr[right - 1]) right -= 1;
                        // one more iteration to skip the last duplicate value || to skip to next part of array if no duplicates
                        left += 1;
                        right -= 1;
                    } else if (arr[left] + arr[right] < target) left += 1; //sum < target, increase sum by left++
                    else right -= 1; //sum > target, decrease sum by right--
                }
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        List result = threeSum(arr);


    }
}
