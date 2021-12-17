package week2;

import java.util.Scanner;

//30. Write a Java program by using two for loops to produce the output shown below:
//1.Input N natural number, print picture like below in size N*N
//***********
//***********
//***********
//***********
public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
