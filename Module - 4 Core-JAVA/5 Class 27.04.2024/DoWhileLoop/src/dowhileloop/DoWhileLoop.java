
package dowhileloop;

import java.util.Scanner;

public class DoWhileLoop {


    public static void main(String[] args) {
  // solved by myself
//             Scanner r = new Scanner(System.in);
//        int randomNum = (int) (Math.random() * 101);
//
//        int maxAttempts = 3;
//        int attemptsCount = 0;
//
//        do {
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
//            
//            if (attemptsCount == maxAttempts) {
//                System.out.println("Sorry! you loss the game and the guess number is " + randomNum);
//            }
//        } while (attemptsCount < maxAttempts);

// Solution by sir
//
        Scanner s = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);

        int maxAttempts = 3;
        int attemptsCount = 0;

        do {
            System.out.println("Please enter your guess number:");
            int guessNumber = s.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("Congratulations!");
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Your guess number is lower.");
            } else if (guessNumber > randomNumber) {
                System.out.println("Your guess number is higher.");
            }

            attemptsCount++;
        } while (attemptsCount < maxAttempts);

        if (attemptsCount == maxAttempts) {
            System.out.println("Sorry, you lost the game. The guess number was " + randomNumber);
        }

        s.close();
    }
    
}
