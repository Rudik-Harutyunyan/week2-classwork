package week3;

//7.Print the elements of the given list in reverse order without changing the list itself.
//Example ` Input ` 1 2 3 4 5
//Output ` 5 4 3 2 1
public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - i - 1]);
        }
    }
}
