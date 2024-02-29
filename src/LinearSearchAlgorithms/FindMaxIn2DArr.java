package LinearSearchAlgorithms;

import java.util.Arrays;

public class FindMaxIn2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 22, 10, 3, 19 },
                { 34, 99, 88, 77 },
                { 12, 18 }
        };
        System.out.println(maximum(arr));
    }

    // static int maximum(int[][] arr){
    // int max=Integer.MIN_VALUE;
    // for(int r=0;r<arr.length;r++){
    // for(int c=0;c<arr[r].length;c++){
    // if(arr[r][c]>max){
    // max=arr[r][c];
    // }
    // }
    // }
    // return max;
    // }
    // writting in Enhanced forloop
    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] r : arr) {
            for (int c : r) {
                if (c > max) {
                    max = c;
                }
            }
        }
        return max;
    }
}
