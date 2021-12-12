package week2;

import java.util.Scanner;

//17. Write a Java Program to Compute the Sum of Digits in a given Integer.
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
