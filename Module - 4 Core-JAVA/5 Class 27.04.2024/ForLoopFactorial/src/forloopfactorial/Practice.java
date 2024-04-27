package forloopfactorial;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.println("Enter number for check prime number or not");
//
//        int pNum = r.nextInt();
//
//        int count = 0;
//
//        for (int i = 1; i <= pNum; i++) {
//            if (pNum % i == 0) {
//                count += 1;
//            }
//        }
//        if (count == 2) {
//            System.out.println("WOW!! "+pNum + " is a Prime Number");
//        } else {
//            System.out.println("Sorry!! "+pNum + "  is not a Prime Number");
//        }

        int pNum = r.nextInt();
        int count = 0;

        for (int i = 1; i <= pNum; i++) {
            if (pNum % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(pNum + " is a prime number");
        } else {
            System.out.println(pNum + " is not prime number");
        }

    }

}
