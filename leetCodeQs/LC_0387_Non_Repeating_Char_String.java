package com.leetCodeQs;

import java.util.Hashtable;

// Leetcode - https://leetcode.com/problems/first-unique-character-in-a-string/
public class LC_0387_Non_Repeating_Char_String {
    public static void main(String[] args) {
        String s = "dabbcb";
        System.out.println("Non-repeating char index = "+firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        Hashtable<Character,Integer> table = new Hashtable<>();
        char ch;
        for (int i = 0; i < s.length(); i+=1){
            ch = s.charAt(i);
            if (!table.containsKey(ch)){table.put(ch,1);}
            else{table.replace(ch,table.get(ch)+1);}
        }
        for (int i = 0; i < s.length(); i+=1){
            ch = s.charAt(i);
            if (table.get(ch)==1){return i;}
        }
        return -1;
    }
}
