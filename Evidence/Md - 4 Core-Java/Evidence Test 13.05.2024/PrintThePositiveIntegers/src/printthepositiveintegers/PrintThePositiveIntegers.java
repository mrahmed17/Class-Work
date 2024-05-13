
package printthepositiveintegers;

import java.util.Scanner;

public class PrintThePositiveIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doSum = 0;
        int storeNumber;
        
        System.out.println("Enter an integer number (Negative num for quit): ");
        storeNumber = scanner.nextInt();

        while (storeNumber >= 0) {
            doSum += storeNumber;
            System.out.println("Enter the next integer number: ");
            storeNumber = scanner.nextInt();
        }

        System.out.println("Sum of your input positive integers is : " + doSum);
    }
        
    }
    