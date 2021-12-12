package week2;

import java.util.Scanner;

//26.Calculate the sum of the given 10 natural numbers.
//Input integers from console
public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            sum = sum + scanner.nextInt();
        }
        System.out.println(sum);


    }
}
