package com.leetCodeQs;

//Link to Q: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

import java.util.Hashtable;

public class LC_1160_Words_from_Chars {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println("Words That Can Be Formed by Characters = "+countCharacters(words,chars));
    }

    public static int countCharacters(String[] words, String chars) {
        int sum = 0;

        Hashtable<Character,Integer> table = new Hashtable<>();
        for (int i = 0; i < chars.length(); i+=1){
            char ch = chars.charAt(i);
            if (!table.containsKey(ch)){table.put(ch,1);}
            else{table.replace(ch,table.get(ch)+1);}
        }

        for (String word: words) {
            if (goodWord(word, table)){sum+=word.length();}
        }

        return sum;
    }

    public static boolean goodWord(String word, Hashtable<Character,Integer> table){
        Hashtable<Character,Integer> table1 = (Hashtable<Character, Integer>) table.clone();

        int n = word.length();
        for (int i = 0; i < n; i+=1){
            char letter = word.charAt(i);
            if (!(table1.containsKey(letter))){return false;} //if letter is not a part of dict at all, return false
            else{
                if (table1.get(letter)==0){return false;}
                else{table1.replace(letter,table1.get(letter)-1);}
            }
        }
        return true;
    }

}
