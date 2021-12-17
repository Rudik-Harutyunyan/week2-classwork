package week4;

//20.Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
public class Task20 {
    public static void main(String[] args) {
        System.out.println(countOfDigitSeven(7));
    }

    public static int countOfDigitSeven(int number) {
        if (number <= 9) {
            if (number == 7) {
                return 1;
            } else {
                return 0;
            }
        }
        return countOfDigitSeven(number % 10) +
                countOfDigitSeven(number / 10);
    }
}

