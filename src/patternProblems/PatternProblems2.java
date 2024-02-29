package patternProblems;

import java.util.Scanner;

public class PatternProblems2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number = 1;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // question2

        // for(int i=n;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // question3

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(number+" ");
        // number++;
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {

                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}