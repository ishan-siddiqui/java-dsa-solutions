package com.dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DS_03_2_Priority_Queue {
    public static void main(String[] args) {

//        Queue<Double> queue = new LinkedList<>();
//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //Collections.reverseOrder() = Reverse order of queue..
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

//        queue.offer(6.5);
//        queue.offer(5.5);
//        queue.offer(6.0);
//        queue.offer(7.5);
//        queue.offer(7.0);
//        queue.offer(8.5);
//        queue.offer(9.5);
//        queue.offer(10.0);

        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("A");
        queue.offer("F");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
