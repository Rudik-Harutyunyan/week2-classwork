package week3;

//5. An array of numbers is given.
// Print the value of the largest element in the array, and then the index of that element in the array.
// If there are several largest elements, print the index of the first of them.
//Example` Input` 1 2 3 2 1
//Output` The largest is 3 index is 2
public class Task5 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 11, 9, 20, -8, 0, 20, 1};
        int largestElement = arr[0];
        int indexOfLargestElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement){
                largestElement = arr[i];
                indexOfLargestElement = i;
            }
        }
        System.out.println(largestElement + " " + indexOfLargestElement);
    }
}
