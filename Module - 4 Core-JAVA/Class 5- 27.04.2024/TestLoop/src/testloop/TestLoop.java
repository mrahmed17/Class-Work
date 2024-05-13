package testloop;

import java.util.Scanner;

public class TestLoop {

    public static void main(String[] args) {

        /* 
        int n = 1;
        while (n <= 100) {
            System.out.println(n + "Hello Java");
            n++;
        }
         */
 /* 
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Start point value");
        int startPoint=r.nextInt();
        System.out.println("Enter end point value");
        int endPoint=r.nextInt();
        
        while (startPoint <= endPoint) {
            System.out.println(startPoint+"Hello Java");
            startPoint++; //startPoint=startPoint+1; startPoint +=1;
        }
         */
        // make a program which can filter number by 3 and 5, and those number did not print. 
        // Method 1:
        //
//        Scanner r = new Scanner(System.in);
//        System.out.println("Enter Start point value");
//        int startPoint = r.nextInt();
//        System.out.println("Enter end point value");
//        int endPoint = r.nextInt();
//
//        while (startPoint <= endPoint) {
//            if (startPoint % 3 ==0 && startPoint % 5==0) {
//                        } else {
//                System.out.println(startPoint);
//            }
//                startPoint++;
//        }
//
//Method 2:
//        Scanner r = new Scanner(System.in);
//        System.out.println("Enter Start point value");
//        int startPoint = r.nextInt();
//        System.out.println("Enter end point value");
//        int endPoint = r.nextInt();
//
//        while (startPoint <= endPoint) {
//            if (startPoint % 3 != 0 || startPoint % 5 != 0) {
//                System.out.println(startPoint);
//            }
//            startPoint++;
//        }
//
// Problem: Guessing Numbers 
// Myself Trying
//        Scanner r = new Scanner(System.in);
//        int pcNum = (int) (Math.random() * 100);
//
//        System.out.println("Enter Your guess Number");
//        int guessNum = r.nextInt();
//
//        while (pcNum > guessNum) {
//            System.out.println("Your guess is too high");
//            if (pcNum < guessNum) {
//                System.out.println("Your guess is too low");
//            } if else ()
//                    { }
//        }
// Problem: Guessing Number
// Sir solve this
// Scanner r = new Scanner(System.in);
//        int randomNum = (int) (Math.random() * 101);
//
//        int maxAttempts = 3;
//        int attemptsCount = 0;
//
//        while (attemptsCount < maxAttempts) {
//            System.out.println("Enter your guess number");
//
//            int guessNum = r.nextInt();
//
//            if (guessNum == randomNum) {
//                System.out.println("Congratulation");
//                break;
//            } else if (guessNum < randomNum) {
//                System.out.println("Your guess is too low");
//            } else if (guessNum > randomNum) {
//                System.out.println("Your guess is high");
//            }
//
//            attemptsCount++;
//            if (attemptsCount == maxAttempts) {
//                System.out.println("Sorry! you loss the game and the guess number is " + randomNum);
//            }
//        }


    }
}
