package week2;

import java.util.Scanner;

//10.  Given 3 real numbers a , b , c .FInd all decisions for
//ax2 + bx + c = 0.Print all decisions, if there is not a decision ,print “Can't be”
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();
        double x1 = 0;
        double x2 = 0;
        double discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            System.out.println("discriminant = 0");
            x1 = -b / 2 * a;
            x2 = x1;
            System.out.println("x1 = " + x1 + "  x2 = " + x2);
        } else if (discriminant > 0) {
            System.out.println("discriminant = 0");
            x1 = -b - Math.sqrt(discriminant);
            x2 = -b + Math.sqrt(discriminant);
            System.out.println("x1 = " + x1 + "  x2 = " + x2);
        } else System.out.println("discriminant < 0 ---> can't be");

    }
}
