package com.leetCodeQs;

import java.util.ArrayList;
import java.util.List;

public class LC_39_Combination_Sum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>(); //final ans list
        List<Integer> cur = new ArrayList(); //list of the sub-problem's solution we get
        backtrack(candidates, target, ans, cur, 0);
        return ans;
    }

    public static void backtrack(int[] candidates, int target, List<List<Integer>> ans, List<Integer> cur, int index) {

    }

    public static void main(String[] args) {

    }
}
