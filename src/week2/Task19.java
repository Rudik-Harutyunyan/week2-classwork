package week2;

import java.util.Scanner;

//19.Print all numbers on the segment from a to b that give the remainder of c when divided by d. If such numbers do not exist, then you do not need to display anything.
//Example ` Input` Output`
//a 2 2 4
//b 5
//c 0
//d 2
//i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a > b){
            for (int i = b; i < a ; i++) {
                if (i % c == d){
                    System.out.println(i);
                }
            }
        }else if (a < b){
            for (int i = a; i < b; i++) {
                if (i % c == d){
                    System.out.println(i);
                }
            }
        }else System.out.println("a = b");
    }
}
