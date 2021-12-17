package week3;

//3. Find the number of positive elements in the given array.
//Example` Input` 1 -1 2 3 -8
//Output 1 2 3
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3, -8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                System.out.println(arr[i]);
            }
        }
    }
}
