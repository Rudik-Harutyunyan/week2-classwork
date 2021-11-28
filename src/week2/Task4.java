package week2;

public class Task4 {
    //4. What happens if concatenate string and another primitive type
    public static void main(String[] args) {
        //concatenate integer + integer, print output
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("sum = " + sum + "     --> integer + integer = integer");
        //concatenate String + integer with other primitive types.
        String str = "hello";
        System.out.println("str + sum  = hello20   --> String + integer = String ");
    }
}
