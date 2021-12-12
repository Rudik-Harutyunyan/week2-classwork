package week2;

import java.util.Scanner;

//13.The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
//-if the average score >= 80%                 =>grade=A
//-if the average score >= 60% and <80% => grade=B
//-if the average score>=40% and < 60% =>grade=C
//-else.   =>grade=F
public class Task13 {
    public static void main(String[] args) {
        char grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter quiz in 1 - 10 range");
        int quiz = scanner.nextInt();
        System.out.println("enter midTerm in 1 - 10 range");
        int midTerm = scanner.nextInt();
        System.out.println("enter final in 1 - 10 range");
        int fin = scanner.nextInt();
        int averageScore = ((quiz + midTerm + fin) / 3) * 10;
        if (averageScore >= 80) {
            grade = 'A';
            System.out.println(grade);
        } else if (averageScore >= 60 && averageScore <= 80){
            grade = 'B';
            System.out.println(grade);
        }else if (averageScore >= 40 && averageScore < 60) {
            grade = 'C';
        }else{
            grade = 'F';
            System.out.println(grade);
        }
    }
}
