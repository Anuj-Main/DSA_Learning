package patternProblems;

import java.util.*;;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }

    public static void calculateFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.println("Invalid Input");
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}