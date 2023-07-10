package com.dataStructures;

public class DynamicArray {
    int size;
    int capacity=10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int Capacity){
        this.capacity = Capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if (size>=capacity){
            grow();
        }
        array[size] = data;
        size+=1;
    }

    public void insert(int index, Object data){
        if (size >= capacity){grow();}
        //Shifting all elements to right one by one..
        for (int i = size; i > index; i-=1){ array[i] = array[i-1];}
        array[index] = data;
        size+=1;
    }

    public void delete(Object data){
        for (int i = 0; i < size; i+=1){
            if (array[i]==data){for (int j = i; j < size-1; j+=1){array[j] = array[j+1];}}
        }
        array[size-1] = null;
        size -=1;

        if (size <= (capacity/3)){shrink();}
    }

    public int search(Object data) {
        for (int i = 0; i < size; i+=1){if (array[i]==data){return i;}}
        return -1;
    }

    private void grow() {
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i+=1){newArray[i] = array[i];}

        capacity = newCapacity;
        array = newArray;
    }

    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i+=1){newArray[i] = array[i];}

        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        String string = "";

        for (int i=0; i < capacity; i+=1){ string += array[i] + ", "; }

        if (string != ""){ string = "[" + string.substring(0,string.length() - 2) + "]"; }
        else{string="[]";}

        return string;
    }
}
