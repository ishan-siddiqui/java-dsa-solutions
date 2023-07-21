package com.leetCodeQs;
//Link to Q - https://leetcode.com/problems/flipping-an-image/
public class LC_832_Flipping_Image {
    public static int[][] flipAndInvertImage(int[][] image){
        for (int[] row: image) {
            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i+=1) {
                // swapping elements
                int temp = row[i] ^ 1; //XOR flips the elements 0 to 1 and 1 to 0
                row[i] = row[image[0].length - 1 - i] ^ 1; //XOR the element
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
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
