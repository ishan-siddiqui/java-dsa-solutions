package com.Algorithms.Recursion;

public class E3_Binary_Search_Recursion {
    public static void main(String[] args) {
        int arr[] = {2,12,34,45,56,67,78,89,90,101};
        System.out.println(binarySearch(arr,0,arr.length-1,68));
    }
    public static int binarySearch(int arr[],int start, int end, int x){
        int mid = start + (end-start)/2;
        if (arr[mid]==x){return mid;}
        if (start>end){return start;}
        if (arr[mid]>x){return binarySearch(arr,start,mid-1,x);}
        if (arr[mid]<x){return binarySearch(arr,mid+1,end,x);}
        return -1;
    }
}
