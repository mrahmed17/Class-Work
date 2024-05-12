package inputnumtoanarray;

import java.util.Scanner;

public class InputNumToAnArray {

    public static void main(String[] args) {

        int[] arrayNumbers = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arrayNumbers[i] = scanner.nextInt();
        }

        System.out.println("See your numbers in the array list:");
        for (int num : arrayNumbers) {
            System.out.print(num + " ");
        }
    }

}
