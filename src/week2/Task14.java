package week2;

import java.util.Scanner;

//14. Print all integer powers of two not exceeding N in ascending order.Input N from console.
// Example ` Input 50(You can not use Math.pow())
//Output ` 1 2 4 8 16 32.
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int N = scanner.nextInt();
        int a = 0;
        for (int i = 1; i < N; i+=i) {
            System.out.println(i);
        }
    }
}


