package com.leetCodeQs;

public class LC_0387_1_Non_Repeating_Char_String_IndexOfMethod {
    public static void main(String[] args) {
        String s = "dabbcb";
        System.out.println("Non-repeating char index = "+firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int n = s.length();
        for (int i = 0; i < n; i+=1){
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){return i;}
        }
        return -1;
    }

}
