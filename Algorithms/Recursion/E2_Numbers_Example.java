package com.Algorithms.Recursion;

//Write a function that takes in a number and prints it
//Print first 5 mumbers : 1 2 3 4 5

public class E2_Numbers_Example {
    public static void main(String[] args) {
        printl(5);
    }

    public static void printl(int m){
        if (m>0){
            printl(m-1);
            System.out.print(m+" ");
        }
    }
}
