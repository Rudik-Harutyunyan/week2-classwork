package week2;

import java.util.Scanner;

//16. .Print all integer numbers from 1 to N, except that are multiple of 3(Input N from console)
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
