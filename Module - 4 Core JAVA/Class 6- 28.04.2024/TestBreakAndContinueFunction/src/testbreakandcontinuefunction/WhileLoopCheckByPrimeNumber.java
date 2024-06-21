package testbreakandcontinuefunction;

import java.util.Scanner;

public class WhileLoopCheckByPrimeNumber {

    public static void main(String[] args) {
//        make a program which can filter number by 3 and 5, and those number did not print. using continue keywords

        Scanner r = new Scanner(System.in);
        System.out.println("Enter Start Point");
        int startPoint = r.nextInt();
        System.out.println("Enter End Point");
        int endPoint = r.nextInt();

        while (startPoint <= endPoint) {
            if (startPoint % 3 == 0 && startPoint % 5 == 0) {
                startPoint++;
                continue;
            }
            System.out.println("Number is " + startPoint);
            startPoint++;
        }

    }

}
