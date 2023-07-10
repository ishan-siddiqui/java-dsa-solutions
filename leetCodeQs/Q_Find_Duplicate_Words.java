package com.leetCodeQs;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Locale;

public class Q_Find_Duplicate_Words {
    public static void main(String[] args) {
        String str = "Hello World is so wrong it should be World Hello";
        System.out.println("List of Duplicate words:- " + duplicateWords(str));
//        String[] result = duplicateWords(str);
//        for (String s : result){
//            System.out.println(s);
//        }
    }


    public static ArrayList<String> duplicateWords(String s){
        ArrayList<String> result = new ArrayList<>();
        Hashtable<String, Integer> table = new Hashtable<>();

        s = s.toLowerCase();
        String[] words = s.split(" ",0);
        int n = words.length;

        for (int i = 0; i < n; i+=1){
            String key = words[i];
            if (!(table.containsKey(key))){table.put(key,1);}
            else {table.replace(key, table.get(key)+1 );}
        }

        for (String key: table.keySet()){
            if ((table.get(key) > 1)){result.add(key);}
        }

        return result;
    }
}
