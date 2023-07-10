package com.dataStructures;

import java.util.LinkedList;

public class DS_05_Linked_List {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println(linkedList);
        linkedList.add(4,"E");
//        linkedList.poll();
        System.out.println(linkedList);
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        linkedList.addFirst("A1");
        System.out.println(linkedList.peekFirst());

        String first = linkedList.removeFirst();

        System.out.println(linkedList.peekLast());
        linkedList.addLast("F1");
        System.out.println(linkedList.peekLast());

        String last = linkedList.removeLast();

        System.out.println(linkedList);

        System.out.println(first + last);


    }
}
