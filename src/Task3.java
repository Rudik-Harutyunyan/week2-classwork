import java.util.Scanner;

public class Task3 {
    // Compute area and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float PI = 3.14159F;
        double r = scanner.nextDouble();
        System.out.println("enter radius");
        double perimeter = 2*PI*r;
        double area = PI*r*r;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
