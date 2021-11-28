package week2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Narrowing Primitive Conversion (Explicit)
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        float f = (float) d;
        System.out.println("double = " + d + " float = " + f);
        long l = (long) f;
        System.out.println("float = " + f + " long = " + l);
        int i = (int) l;
        System.out.println("long = " + l + " int = " + i);
        short sh = (short) i;
        System.out.println("int = " + i + " short = " + sh);
        byte b = (byte) sh;
        System.out.println("short = " + sh + " byte = " + b);
    }
}
