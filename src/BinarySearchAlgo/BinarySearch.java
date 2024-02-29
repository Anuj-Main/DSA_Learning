package BinarySearchAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -18, -15, -12, -9, -6, -3, 0, 5, 15, 30, 45, 85, 115 };
        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return index
    // return -1 if element does not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // finding the middle value
        while (start <= end) {
            // int mid=start+end/2// it might be give a large value,so it will exceed from
            // int and it will give error
            // best way to find middle value
            int mid = start + end - start / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
