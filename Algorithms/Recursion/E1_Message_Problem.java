package com.Algorithms.Recursion;

public class E1_Message_Problem {
    public static void main(String[] args) {
        message(30);
    }

    public static void message(int n){
        if (!(n>0)){ return;}
        else {
            System.out.println("Hello World");
            message(n-1);}

    }
}
