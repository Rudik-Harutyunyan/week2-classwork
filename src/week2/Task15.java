package week2;

import java.util.Scanner;

//15. For a given natural N print the smallest integer k that`
//Math.pow(2,k)≥N.(You can not use Math.pow())
//Example` Input 7
//Output 3
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int N = scanner.nextInt();
        int k = 1;
        for (int i = 2; i <= N; i*=2) {
            k++;
        }
        System.out.println(k);

    }
}
