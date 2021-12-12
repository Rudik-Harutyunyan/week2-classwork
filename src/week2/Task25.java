package week2;

import java.util.Scanner;

//25. Given an integer x
//Count the number of natural divisors of x (including 1 and the number itself; x≤2 ∗ 109).
public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x");
        int x = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= x; i++) {
            if(x % i == 0){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
