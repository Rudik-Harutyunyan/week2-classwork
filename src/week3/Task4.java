package week3;

//4. A list of numbers is given. Print all the elements of the list that are larger than the previous element.
//Example` Input ` 1 5 2 4 3 Output` 5 4
public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] > arr[i]) {
                System.out.println(arr[i+1]);
            }
        }
    }
}
