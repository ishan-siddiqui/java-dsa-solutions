package com.Algorithms.SlidingWindow;

public class break_continue_difference {
    public static void main(String[] args) {
        //Break -
        System.out.println("Solution for break:-");
        for (int i = 0; i < 10; i+=1){
            if (i==5){break;}
            System.out.println(i);
        }
        System.out.println("Solution for continue:-");
        for (int i = 0; i < 10; i+=1){
            if (i==5){continue;}
            System.out.println(i);
        }
    }
}
