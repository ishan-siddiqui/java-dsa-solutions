package com.leetCodeQs;

// Link to Q - https://leetcode.com/problems/flipping-an-image/


public class LC_832_Flipping_Image_Old_Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        int len1 = image.length;
        int len2 = image[0].length;
//         Reverse the entire array's elements
        multiReverse(image);

//         Now invert-
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }

    static void multiReverse(int[][]arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            int start = 0;
            int end = arr.length-1;
            while (start<end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start+=1;
                end-=1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] image ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println("-----BEFORE FLIP AND INVERT IMAGE------");
        for (int i = 0; i < image.length; i+=1) {
            for (int j = 0; j < image[i].length; j+=1) {
                System.out.print(image[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] newImage = flipAndInvertImage(image);

        System.out.println("-----AFTER FLIP AND INVERT IMAGE------");
        for (int i = 0; i < newImage.length; i+=1) {
            for (int j = 0; j < newImage[i].length; j+=1) {
                System.out.print(newImage[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
