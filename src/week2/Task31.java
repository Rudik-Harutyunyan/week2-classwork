package week2;

import java.util.Scanner;

//31.Write a program that prompts the user for the size (a non-negative integer in int);
// and prints the following checkerboard pattern.
//# # # # # # # N * N
//# # # # # # #
//# # # # # # #
//# # # # # # #
//# # # # # # #
//# # # # # # #
//# # # # # # #
public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
