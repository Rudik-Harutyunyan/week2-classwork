package week3;

import java.util.Scanner;

// Print all even numbered items in the list.
//Input natural integer N
//define an array with size N,
//Initialize it
//Example ` Input` 1 2 3 4 5 10
//Output` 2 4 10
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[]arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();

        }
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
