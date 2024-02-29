package LinearSearchAlgorithms;

public class SearchInRange {
    public static void main(String[] args) {
        int[] ar = { 12, 53, 221, -4, 5, -10 };
        int target = -10;
        System.out.println(linearSearch(ar, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -2;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
