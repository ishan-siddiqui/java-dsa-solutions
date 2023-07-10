package com.dataStructures;

import java.util.Hashtable;

public class DS_08_Hash_Table {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>(10); //default cap = 11, loadFactor = 0.75
        //Adding Key:Value Pairs -

        table.put("100","Spongebob");
        table.put("123","Patrick");
        table.put("321","Sandy");
        table.put("555","Squidward");
        table.put("777","Gary");

        //Display value of specific key -
        System.out.println(table.get(100));

        //How to display all key value pairs?
        //1. Use a for loop..
        for (String key : table.keySet()){
//            table.keySet() is iterable, will return all keys..
            System.out.println(key.hashCode() % 10 +"\t"+key+" : "+table.get(key));
        }

//        table.remove(555);
    }
}
