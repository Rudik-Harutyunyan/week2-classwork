package week2;

import java.util.Scanner;

//12. Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2, etc.
public class Task12 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the weekday");
        String str = scanner.next();
        if (str == "sunday"){
            num = 1;
        }else if (str == "monday"){
            num = 2;
        }

    }
}
