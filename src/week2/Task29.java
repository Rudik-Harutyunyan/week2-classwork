package week2;

import java.util.Scanner;

// 29. "GNCHE-1" is a complex electronic device that issues every second the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high cost of electronic components, you have been instructed to develop an emulator for these devices.
//The number of seconds (from 1 to 1,000,000) is given that the generator works after being turned on.
//Example` Input` Output`
//2 1 2
//5 1 2 2 3 3
//7 1 2 2 3 3 3 4
public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int seconds = scanner.nextInt();
        for (int i = 0; i <= seconds; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i  + " ");
                counter++;
                if (counter > seconds) {
                    return;
                }
            }
            seconds--;
        }
    }
}
