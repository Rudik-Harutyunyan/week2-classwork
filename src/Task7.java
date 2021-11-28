import java.util.Scanner;

/*7. Input from console int a and int b, if a and b corresponds for following requirements print “Both a and b legal”, if any of them does not correspond print about it like this “a is legal b is illegal ''. or vice versa
        a > 10 and b is not equal to 10
        both a and b is positive
        both a and b is negative
        a > 10 b < 1 both of them are odd
        a is a multiple of 5 OR b is a multiple of 5
        a is not a multiple of 5 but b is a multiple of 5
*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       /* if ((a > 10) || (b != 10)) {
            if (b==10) {
                System.out.println("a is legal b illegal");
            }
            else if (a<=10){
                System.out.println("a is illegal b is legal");
            }
            else{
                System.out.println("a is legal and b is legal");
            }


        }
    }


        if ((a>0) || (b>0)){
            if (a<0){
                System.out.println("a is illegal b is legal");
            }
            else if (b<0){
                System.out.println("a is legal b is illegal");
            }else {
                System.out.println(" both of a and b are legal");
            }
        }


        if ((a < 0) || (b < 0)){
            if (a>0){
                System.out.println("a is illegal b is legal");
            }
            else if (b>0){
                System.out.println("a is legal b is illegal");
            }else System.out.println(" both of a and b are legal");
        }

        if  ((a % 2 == 1) && (b % 2 == 1)){
            if ((a > 10) || (b < 1)){
                if (a<=10){
                    System.out.println("a is illegal b is legal");
                }else if (b>=1){
                    System.out.println("a is legal b is illegal");
                }else System.out.println("both a and b are legal");
            }
        }
    }

        */


    }
}