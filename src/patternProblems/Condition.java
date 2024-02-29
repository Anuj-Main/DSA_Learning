package patternProblems;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        int button = sc.nextInt();
        // if (a==b) {
        // System.out.println(a+" is equal to "+b);
        // }else if (a<b) {
        // System.out.println(a+" is lesser than "+b);
        // }else{
        // System.out.println(a+" is greater than "+b);
        // }
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
            default:
                System.out.println("Invalid button");

        }
    }
}
