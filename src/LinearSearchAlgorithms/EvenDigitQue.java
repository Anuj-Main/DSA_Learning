package LinearSearchAlgorithms;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitQue {
    public static void main(String[] args) {
        int[] nums = { 12, 53, -2221, 4, 5, 10 };
        System.out.println(findNumbers(nums));
        System.out.println(digitCount2(-2342342));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // store the number of digts counts
    static boolean even(int num) {
        int evenNumberOfDigit = digitCount(num);
        if (evenNumberOfDigit % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digitCount2(int num) {
        if (num < 0) {
            num = num * -1;

        }
        return (int) (Math.log10(num));
    }

    // count the number of digits in number
    static int digitCount(int num) {
        if (num < 0) {
            num = num * -1;

        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
