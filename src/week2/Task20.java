package week2;

import java.util.Scanner;

//20.Integers a and b are entered. It is guaranteed that a does not exceed b.
//Print all numbers on the segment from a to b that are exact squares. If there are no such numbers, then you do not need to display anything.
//Example`
//Input` 2 Output ` 4
//8
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter a so it is <= b");
        int a = scanner.nextInt();
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (i * i < b) {
                    System.out.println(i * i);
                }
            }
        }


    }
}
