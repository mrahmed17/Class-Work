package grateingpoint;

import java.util.Scanner;

public class GrateingPoint {

    public static void main(String[] args) {

 //Method 1: Big Grade Point To Small Grade Point
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter Your Grade Point");
//        int grade;
//
//        grade = input.nextInt();
//
//        if (grade >= 80) {
//            System.out.println("A+");
//        } else if (grade >= 70) {
//            System.out.println("A");
//        } else if (grade >= 60) {
//            System.out.println("B");
//        } else if (grade >= 50) {
//            System.out.println("C");
//        } else if (grade >= 40) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//
//Method 2: Small Grade Point To Big Grade Point
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Score Number");

        int score;
        score = input.nextInt();

        if (score <= 32) {
            System.out.println("F");
        } else if (score <= 49.0) {
            System.out.println("D");
        } else if (score <= 59.0) {
            System.out.println("C");
        } else if (score <= 69.0) {
            System.out.println("B");
        } else if (score <= 79.0) {
            System.out.println("A");
        } else {
            System.out.println("A+");
        }

    }

}
