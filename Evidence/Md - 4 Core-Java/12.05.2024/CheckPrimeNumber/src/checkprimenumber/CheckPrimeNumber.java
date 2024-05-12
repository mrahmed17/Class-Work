package checkprimenumber;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number");
        int number = input.nextInt();
        checkPrime(number);
    }

    public static void checkPrime(int number) {

        int temp = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                temp++;
            }
        }

        if (temp == 2) {
            System.out.println(number+" is a prime number");
        } else {
            System.out.println(number+" is not a prime number");
        }

    }
}
