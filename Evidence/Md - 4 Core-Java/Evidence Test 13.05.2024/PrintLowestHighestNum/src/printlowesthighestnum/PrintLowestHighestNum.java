package printlowesthighestnum;

import java.util.Scanner;

public class PrintLowestHighestNum {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int lowestNum = Integer.MAX_VALUE;
        int highestNum = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer number : ");
            int number = scanner.nextInt();

            if (number < lowestNum) {
                lowestNum = number;
            }

            if (number > highestNum) {
                highestNum = number;
            }
        }

        System.out.println("The Lowest number is : " + lowestNum);
        System.out.println("The Highest number is : " + highestNum);
    }
}

//        
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter First Number");
//        int firstNum = scanner.nextInt();

//        System.out.println("Enter Second Number");
//        int secondNum = scanner.nextInt();

//        System.out.println("Enter Third Number");
//        int thirdNum = scanner.nextInt();

//        System.out.println("Enter Fourth Number");
//        int fourthNum = scanner.nextInt();

//        System.out.println("Enter Five Number");
//        int fiveNum = scanner.nextInt();
//
//      
//        System.out.println("Lowest number is " +);
//        System.out.println("Highest number is " +);
//
//    }
//
//}
