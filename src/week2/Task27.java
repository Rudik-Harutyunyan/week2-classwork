package week2;

import java.util.Scanner;

// Convert a natural number from binary to decimal (no more than 10 digits in a binary number).
//Example` Input ` 1001 Output` 9
//111 Output` 7
public class Task27 {

    public static int binaryToDecimal(String binary) {
        int length = binary.length();
        int decimal = 0;
        for (int i = length - 1; i >= 0; i--) {
            int numericValue = Character.getNumericValue(binary.charAt(i));
            decimal += numericValue * Math.pow(2, length - i - 1);
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();
        System.out.println(binaryToDecimal(binary));
    }
}
