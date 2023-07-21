package com.leetCodeQs;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;

public class LC_268_Missing_Number {
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        Hashtable<Integer,Integer> table = new Hashtable<>();
        for (int i = 0; i <= n; i++) {
            table.put(i,0);
        }
        for (int i = 0; i < arr.length; i++) {
            table.replace(arr[i],1);
        }
        Set<Integer> keys = table.keySet();
        for (int key: keys) {
            if (table.get(key)==0) return key;
        }
        return -1;
    }

    public static int missingNumberSUM(int[] arr){
        int n = arr.length;
        int sumArr = 0;
        for(int num : arr)sumArr += num;
        int sumRange = 0;
        for (int i = n; i > 0; i -=1) {
            sumRange += i;
        }
        return sumRange - sumArr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2};
        System.out.println("Missing number = "  + missingNumberSUM(arr));
        int num = 5;
        System.out.println("4 & 1 = " + (4 & 1));
    }
}
