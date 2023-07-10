package com.leetCodeQs;

//Link to Q: https://leetcode.com/problems/maximum-length-of-repeated-subarray/

import java.util.Map;

public class LC_718_Max_Length_Of_Repeated_Subarray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        System.out.println("Max Length of Repeated Subarray = "+  findLength( nums1,nums2));

    }

    public static int findLength(int[] nums1, int[] nums2) {
        //we will freeze nums2 and iterate across nums1 using slider method
        int n2 = nums2.length;
        int n1 = nums1.length;
        int ans = 0;
        //First, we fix nums2 -
        for (int j = 0; j < n2; j+=1){
            for (int i = 0; i < n1-1; i +=1){
                    int count = 0;
                    if (nums1[i+1]==nums2[j+1]){
                        count+=1;
                        ans = Math.max(ans,count);
                    }

            }
        }
        return ans;
    }

}
