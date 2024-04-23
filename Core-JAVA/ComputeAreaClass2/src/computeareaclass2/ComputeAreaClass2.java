package computeareaclass2;

import java.util.Scanner;

public class ComputeAreaClass2 {

    public static void main(String[] args) {

// Radius Area Calculation
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the value of Radius:");
//
//        int radius = input.nextInt();
//
//        double area;
//
//        area = radius * radius * 3.1416;
//
//        System.out.println(area);
//
//Rectangular Area Calculation
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the value of Length:");
//
//        double length = input.nextDouble();
//        System.out.println("Please enter the value of Width:");
//        double width = input.nextDouble();
//
//        double area;
//
//        area = length * width;
//        System.out.println("Area of Rectangular is " + area);
//
//Total Number Calculator
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First Number:");
        double first = input.nextDouble();

        System.out.println("Please enter Second Number:");
        double second = input.nextDouble();

        System.out.println("Please enter Second Number:");
        double third = input.nextDouble();

        System.out.println("Please enter Second Number:");
        double fourth = input.nextDouble();

        double total;

        total = first + second + third + fourth;
        System.out.println("Your Total Value is " + total);
    }

}
