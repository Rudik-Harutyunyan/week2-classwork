package week2;

import java.util.Random;

//6. Generate and print random integer number between 2 to 7(not using bound)
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        if(randomNumber<0){
            randomNumber=-randomNumber;
        }
        int a = 2+ randomNumber%6;

        System.out.println(a);

    }
}

