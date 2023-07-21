package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/container-with-most-water/
public class LC_11_Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        // 2 pointer approach
        while (left < right){
            int area = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(result, area);
            // shift the pointer of smaller height further
            if (height[left] < height[right]) left+=1;
            else right -=1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum Area = " + maxArea(height));
    }
}
