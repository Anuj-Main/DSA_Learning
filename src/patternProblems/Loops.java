package patternProblems;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum=0;
        // for(int i=1;i<=n;i++){
        // sum=sum+i;
        // }
        // System.out.println(sum);

        for (int j = 1; j < 11; j++) {
            System.out.println(j * n);
        }
    }
}