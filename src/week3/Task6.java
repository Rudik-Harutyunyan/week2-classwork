package week3;

//6.Print the value of the smallest of all positive elements in the list. It is known that the list contains at least one positive element, and the absolute value of all elements of the list does not exceed 1000.
//Example ` Input ` 5 -4 3 -2 1
//Output ` 1
public class Task6 {
    public static void main(String[] args) {
        int[] arr = {5, -4, 3, -2, 11, 20, 2};
        int smallestElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < smallestElement) {
                smallestElement = arr[i];
            }
        }
        System.out.println(smallestElement);
    }
}
