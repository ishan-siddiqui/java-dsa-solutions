package com.dataStructures;

import java.util.ArrayList;

public class DS_06_Dynamic_Arrays {
    //        Aka ArrayList in Java
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");

        System.out.println("size: "+dynamicArray.size);
        System.out.println(dynamicArray);
        dynamicArray.add("K");
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);
        dynamicArray.insert(0,"X");

        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);

        dynamicArray.delete("A");
        System.out.println(dynamicArray);
        System.out.println("size: "+dynamicArray.size);

        System.out.println("Searching for index for \"A\": "+dynamicArray.search("A"));
        System.out.println("Searching for index for \"A\": "+dynamicArray.search("H"));

        dynamicArray.delete("X");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");
        dynamicArray.delete("F");

        System.out.println(dynamicArray);

    }

}
