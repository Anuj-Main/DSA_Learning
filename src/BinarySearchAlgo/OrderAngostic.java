package BinarySearchAlgo;

public class OrderAngostic {
    public static void main(String[] args) {
        // int[] arr={-18,-15,-12,-9,-6,-3,0,5,15,30,45,85,115};
        int[] arr = { 115, 100, 85, 70, 55, 40, 35, 20, 5, 0, -1, -5, -10 };
        int target = -1;
        int ans = orderAngostic(arr, target);
        System.out.println(ans);
    }

    //
    static int orderAngostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        // finding the middle value
        while (start <= end) {
            // int mid=start+end/2// it might be give a large value,so it will exceed from
            // int and it will give error
            // best way to find middle value
            int mid = start + end - start / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
