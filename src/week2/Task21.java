package week2;

import java.util.Scanner;

//21.Enters 2 integer numbers : x and d from console
//Count and print one number - how many times the digit d occurs in the representation of a natural number x
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();
        System.out.println("enter d");
        int d = scanner.nextInt();
        int count = 0;
        while (x > 0) {
            if (d == x % 10){
                count++;
            }
                x = x / 10;
        }
        System.out.println(count);
    }
}
