package week2;

import java.util.Scanner;

//11. Write a java program to find maximum from a given 3 integer numbers using ternary operator.Input numbers from console.
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);


    }
}
