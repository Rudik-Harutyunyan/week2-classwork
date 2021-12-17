package week3;

//8.In the list, all items are different. Swap the minimum and maximum elements of this list.
//Example ` Input ` 3 2 1 4 5
//Output ` 3 2 5 4 1
public class Task8 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5, 10, 7};
        int swap = 0;
        int min = arr[0];
        int minIndex = 0;
        int max = arr[1];
        int maxIndex = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[maxIndex]) {
                System.out.print(arr[minIndex] + " ");
            } else if (arr[i] == arr[minIndex]) {
                System.out.print(arr[maxIndex] + " ");
            } else System.out.print(arr[i] + " ");

        }


    }
}
