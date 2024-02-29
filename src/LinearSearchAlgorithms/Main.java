package LinearSearchAlgorithms;

public class Main {
    public static void main(SearchInString[] args) {
        int[] ar = { 11, 92, 3, 4, -5, -11, 44 };
        int target = -44;
        int ans = linearSearch(ar, target);
        System.out.println(ans);
        int ans2 = linearSearch2(ar, target);
        System.out.println(ans2);
        boolean ans3 = linearSearch3(ar, target);
        System.out.println(ans3);
    }

    // In boolean form like True or False
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // give element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    // search in the array and give index value of that element
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -2;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
