package week2;

import java.util.Scanner;

// 9. Given coordinates of two points in the coordinate plane.
// Write java program to check if the points lie in the same plane?(quarter)
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x1");
        int x1 = scanner.nextInt();
        System.out.println("enter y1");
        int y1 = scanner.nextInt();
        System.out.println("enter x2");
        int x2 = scanner.nextInt();
        System.out.println("enter y2");
        int y2 = scanner.nextInt();
        if ((x1 >= 0 && y1 >= 0) && (x2 >= 0 && y2 >= 0)) {
            System.out.println("points are in the same quarter");
        }else if ((x1 >=0 && y1 <= 0) && (x2 >= 0 && y2 <= 0)){
            System.out.println("points are in the same quarter");
        }else if ((x1 <= 0 && y1 <= 0) && (x2 <= 0 && y2 <= 0)){
            System.out.println("points are in the same quarter");
        }else if ((x1 <= 0 && y1 >=0) && (x2 <= 0 && y2 >= 0)){
            System.out.println("points are in the same quarter");
        }else System.out.println("points are NOT in the same quarter");

    }
}
