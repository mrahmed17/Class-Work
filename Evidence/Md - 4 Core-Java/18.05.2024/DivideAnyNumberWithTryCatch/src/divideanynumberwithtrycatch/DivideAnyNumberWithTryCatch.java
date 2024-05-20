package divideanynumberwithtrycatch;

import java.util.Scanner;

public class DivideAnyNumberWithTryCatch {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter an integer");
//
//            int numerator = scanner.nextInt();
//
//            System.out.println("Enter anotehr integer (denominator)");
//            int denominator = scanner.nextInt();
//
//            if (denominator == 0) {
//                System.out.println("Error: Cannot divide by Zero");
//            } else {
//                int result = numerator / denominator;
//                System.out.println("Result of division: " + result);
//            }
//
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }

        // From Mostafa
        try ( Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter a integer number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the number 0: ");
            int numZero = scanner.nextInt();

            try {
                int result = num1 / numZero;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero error occurred!");
            }
            {
                scanner.close();
            }
        }

    }

}
