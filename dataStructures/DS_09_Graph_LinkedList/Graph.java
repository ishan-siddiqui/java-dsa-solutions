package com.dataStructures.DS_09_Graph_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> alist;

    Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dest){
//        LinkedList<Node> currentList = alist.get(src);
//        Node destNode = alist.get(dest).get(0);
//        currentList.add(destNode);
//        alist.get(src).add(destNode);

        Node destNode = alist.get(dest).get(0);
        alist.get(src).add(destNode);
    }

    public boolean checkEdge(int src, int dest){
        LinkedList<Node> currentList = alist.get(src);
        Node destNode = alist.get(dest).get(0);

        for (Node node: currentList){
            if (node==destNode){return true;}
        }
        return false;
    }

    public void print(){
        for (LinkedList<Node> currentList : alist){
            for (Node node: currentList){
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }
}
