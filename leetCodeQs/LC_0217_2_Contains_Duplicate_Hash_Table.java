package com.leetCodeQs;
// Link to Q - https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Hashtable;

public class LC_0217_2_Contains_Duplicate_Hash_Table {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicateOptimised(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i < n; i+=1){
            if (!table.containsKey(nums[i])){table.put(nums[i],1);}
            else {table.replace(nums[i],table.get(nums[i])+1);}
        }
        for (Integer key: table.keySet()){
            if (table.get(key)>1){return true;}
        }
        return false;
    }

    public static boolean containsDuplicateOptimised(int[] nums) {
        int n = nums.length;
        Hashtable <Integer, Integer> table = new Hashtable<>(); //Key: value = nums[i] : count
        for(int i = 0; i < n; i +=1){
            if(table.containsKey(nums[i])){return true;} // if it was already existing and is coming back -> count > 1 -> return true
            table.put(nums[i],1); // since it was not already there means count = 1 of that number
        }
        return false; // if not one count in hashtable > 1, we return false
    }

    public static boolean containsDuplicateHashSets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> uniques = new HashSet<>();
        for(int i = 0; i < n; i +=1){
            if(uniques.contains(nums[i])){return true;}
            uniques.add(nums[i]);
        }
        return false;
    }
}
