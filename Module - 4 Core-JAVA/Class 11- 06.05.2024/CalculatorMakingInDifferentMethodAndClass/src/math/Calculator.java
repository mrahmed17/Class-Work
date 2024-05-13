package math;

public class Calculator {

    public Calculator() {
    }

    static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int subtrack(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    
    switch (Calculator) {
        case 1:
            System.out.println("Sum is " + sum(firstNumber, secondNumber));
            break;
        case 2:
            System.out.println("Subtrack is " + subtrack(firstNumber, secondNumber));
            break;
        case 3:
            System.out.println("Multiply is " + multiply(firstNumber, secondNumber));
            break;
        case 4:
            System.out.println("Dividen is " + divide(firstNumber, secondNumber));
            break;
    }
    
}


/*
Code from Nusrat

package math;

import java.util.Scanner;

public class CheckCalculator {
    
    double calculation= 0;
    public CheckCalculator(){
    
    }
    
    public CheckCalculator(double newCalculation){
    this.calculation=newCalculation;
    }
    public double checkCalculation(){
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division:&quot￼;
        int operation = s.nextInt();
        
        System.out.println("Enter 1st Number&quot￼;
        double num1= s.nextDouble();
        System.out.println("Enter 2nd number&quot￼;
        double num2= s.nextDouble();
        
        
        switch (operation) {
            case 1:
                return num1 + num2;
                
                
            case 2:
                return num1 - num2;
                
            case 3:
                return num1 * num2;
                
                
            case 4:
                return num1 / num2;
                
                
            default:
                System.out.println("Invalid operation!&quot￼;
                break; 
        }
        return 0; // Default return value if none of the cases match
    }
}


*/

/*

Code from Towhid.

package evidence;

public class DoSum {

    public int number1;
    public int number2;

    public DoSum() {
    }

    public DoSum(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int FindSum() {
        return number1 + number2;
    }

    public int FindSubtraction() {
        return number1 - number2;
    }

    public int FindMultiple() {
        return number1 * number2;
    }

    public int FindDivide() {
        return number1 / number2;
    }

}


*/
