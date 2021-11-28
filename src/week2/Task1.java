package week2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Widening Primitive Conversion (Implicit)
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        short sh = b;
        System.out.println("byte = " + b + " short = " + sh);
        int i = sh;
        System.out.println("short = " + sh + " int = " + i);
        long l = i;
        System.out.println("int = " + i + " long = " + l);
        float f = l;
        System.out.println("long = " + l + " float = " + f);
        double d = f;
        System.out.println("float = " + f + " double = " + d);

    }
}
