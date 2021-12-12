package week2;

import java.util.Scanner;

// 28.Enter the number N, followed by N integers.
//Count how many zeros, positive numbers, negative numbers among the given N numbers.
//It is necessary to print first the number of zeros, then the number of positive and negative numbers.
public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        counter(arr);
    }

    public static void counter(int[] array) {
        int counterZero = 0;
        int counterNegative = 0;
        int counterPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counterZero++;
            } else if (array[i] < 0) {
                counterNegative++;
            } else counterPositive++;

        }
        System.out.println("zero numbers -->  " + counterZero);
        System.out.println("negative numbers -->  " + counterNegative);
        System.out.println("positive numbers -->  " + counterPositive);
    }
}
