package testprimenumberby2method;

import java.util.Scanner;

public class TestPrimeNumberBy2Method {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        System.out.println("Enter any number to Check Prime Number ");
        int inputData = r.nextInt();
        boolean result = checkData(inputData);

        if (result) {
            System.out.println(inputData + " is a prime Number.");
        } else {
            System.out.println(inputData + " is not a prime Number.");
        }
    }

    public static boolean checkData(int primeNum) {
        int count = 0;
        for (int i = 1; i <= primeNum; i++) {
            if (primeNum % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

}
