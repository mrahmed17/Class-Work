package makingarray;

import java.util.Random;

public class MakingArray {

    public static void main(String[] args) {

        int[] arrayNumbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = rand.nextInt(20) + 1;
        }

        System.out.print("Here is your random numbers in the array: ");
        for (int num : arrayNumbers) {
            System.out.print(num + " ");
        }
    }

}
