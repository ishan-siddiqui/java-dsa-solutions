package com.dataStructures.DS_09_Graph_Matrix;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){
        return (matrix[src][dest] == 1);
    }

    public void print(){
        System.out.print("  ");
        for (Node node: nodes){
            System.out.print(node.data + " ");
        }
            System.out.println();

        for (int i = 0; i < matrix.length; i+=1){
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j+=1){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
