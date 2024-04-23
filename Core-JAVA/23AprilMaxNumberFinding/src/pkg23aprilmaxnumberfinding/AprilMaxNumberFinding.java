package pkg23aprilmaxnumberfinding;

import java.util.Scanner;

public class AprilMaxNumberFinding {

    public static void main(String[] args) {

//        Scanner scanner =new Scanner(System.in);
//        int maxNumber;
//        
//        System.out.println("Enter First Number");
//        int firstNumber=scanner.nextInt();
//        
//        System.out.println("Enter Second Number");
//        int secondNumber=scanner.nextInt();
//        
//        System.out.println("Enter Third Number");
//        int thirdNumber=scanner.nextInt();
//        
//        if(firstNumber>secondNumber && firstNumber>thirdNumber){
//        maxNumber=firstNumber;
//        }
//        else if(secondNumber>firstNumber && secondNumber>thirdNumber){
//        maxNumber=secondNumber;
//        }
//        else{
//        maxNumber=thirdNumber;}
//        
//        System.out.println("Max Number is " + maxNumber);
        Scanner scanner = new Scanner(System.in);
        int maxNumber;
        
        System.out.println("Enter First Number");
        int firstNumber=scanner.nextInt();
        
        System.out.println("Enter Second Number");
        int secondNumber=scanner.nextInt();
        
        System.out.println("Enter Third Number");
        int thirdNumber=scanner.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
        maxNumber=firstNumber;}
        else if(secondNumber>firstNumber && secondNumber>thirdNumber){
        maxNumber=secondNumber;}
        else{
         maxNumber=thirdNumber;}
        
        System.out.println("Max Number is: " + maxNumber);
        
    }

}
