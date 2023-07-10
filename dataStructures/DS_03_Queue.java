package com.dataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class DS_03_Queue {
    public static void main(String[] args) {
//        Queue<String> queue = new Queue<String>(); //Queue<String>() gives error - since queue is not a class, it is an interface.. it is more of a template that you can apply to other class.
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

// Cool Queue Functions -
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);  //Benefit of poll() method - it won't throw an exception if queue is empty..

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());


    }
}
