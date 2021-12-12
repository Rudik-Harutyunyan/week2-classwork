package week2;

import java.util.Scanner;

//23.Given an integer number x
//Find the smallest natural divisor of x other than 1 (2 <= x <= 30000).
//Example`
//Input` 6 Output` 2
public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();
        int minDivisor = 0;
        for (int i = 2; i <= x; i++) {
            if (x % i == 0){
                minDivisor = i;
                break;
            }
        }
        System.out.println(minDivisor);

    }
}
