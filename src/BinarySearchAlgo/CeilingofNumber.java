package BinarySearchAlgo;

public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int ans = ceilingofNumber(arr, target);
        System.out.println(ans);
    }

    static int ceilingofNumber(int[] arr, int target) {
        // what is the target number is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        // returning the index of smallest no >=target
        while (start <= end) {
            int mid = start + end - start / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
