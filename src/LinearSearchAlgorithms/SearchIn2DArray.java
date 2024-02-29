package LinearSearchAlgorithms;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 22, 10, 3, 19 },
                { 34, 99, 88, 77 },
                { 12, 18 }
        };
        int target = 99;
        int[] ans = search(arr, target);// format of return value is [row][column]
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target) {
                    System.out.print("I have found the answer: ");
                    return new int[] { r, c };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
