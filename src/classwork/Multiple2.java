package classwork;

public class Multiple2 {
    public static void main(String[] args) {

    }

    public static boolean isPowerOfTwo(int num){
        boolean result = true;
        while (num <= 2){
            if(num % 2 == 1){
                return false;
            }
            num = num / 2;

        }return result;
    }

}
