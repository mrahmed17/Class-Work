package checkprimenumber01;

import java.util.Scanner;

public class CheckPrimeNumber01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for check Prime or Not");
        int getNumber = input.nextInt();
        
        checkPrime(getNumber);
    }

    public static void checkPrime(int number) {

        int commonNum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                commonNum++;
            }
        }

        if (commonNum == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

}
