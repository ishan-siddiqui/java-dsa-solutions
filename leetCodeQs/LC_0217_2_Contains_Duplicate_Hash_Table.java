package com.leetCodeQs;

import java.util.Hashtable;

public class LC_0217_2_Contains_Duplicate_Hash_Table {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
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
}
