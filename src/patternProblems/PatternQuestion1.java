package patternProblems;

import java.util.Scanner;

public class PatternQuestion1 {
    public static void main(String[] args) {
        int n = 5;
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=m;j++){
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        // question2

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=m;j++){
        // if (i==1||j==1||i==n||j==m) {
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println(" ");
        // }

        // question3

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }

        // question4

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // question5

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=n-i;j++){
        // System.out.print(" ");
        // }
        // for(int j=1; j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }
    }
}