package week3;

import java.util.Scanner;

//1.Print all elements of the array with even indices (that is, A [0], A [2], A [4]...)
//Input natural integer N
//define an array with size N,
//Initialize it
//Example ` Input` 1 2 3 4 5
//Output` 1 3 5
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[]arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        printArrayEvenIndices(arr);
    }

    public static void printArrayEvenIndices(int[]array){

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
