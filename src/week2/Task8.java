package week2;
// 8. Input int values a and b from console
//if one of them is multiple of 7, and both positive, and a greater than b, print all odd values between them
//else print all even values between them

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a , b ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int odd = 0;
        if ((a % 7 == 0) || (b % 7 == 0)) {
            if ((a > b) && (b > 0)) {
                for (int i = 1; i <= a; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }else {
                for (int i = a; i < b; i++) {
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
            }
        }

    }
}


