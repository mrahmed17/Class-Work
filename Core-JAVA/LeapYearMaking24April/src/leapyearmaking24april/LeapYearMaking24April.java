package leapyearmaking24april;

import java.util.Scanner;

public class LeapYearMaking24April {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter a year: ");
//
//        int year = input.nextInt();
//
//        boolean isLeapYear
//                = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//
//        System.out.println(year+" is a leap year? " +isLeapYear);
//
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year: ");

        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
