package testprimenumberby2method;

import java.util.Scanner;

public class FindPrimeNumber {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.println("Enter any number to check prime number");
        int inputData = r.nextInt();
        findPrime(inputData);

    }

    public static void findPrime(int number) {
        int count = 0;
        for (int i = 1; i  <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not A Prime Number");
        }

    }

}
