
package calculatormakingindifferentmethodandclass;

import java.util.Scanner;

public class CalculatorMakingInDifferentMethodAndClass {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
       
            
        System.out.println("Enter First Number: ");
        int firstNumber=input.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber=input.nextInt();
                               
        System.out.println();
        
        
    }
    
}

/*
Code from Nusrat:

package testclassandobject;

import math.CheckCalculator;

public class TestClassAndObject {

    public static void main(String[] args) {
        
       
        CheckCalculator number=new CheckCalculator();
         double result= number.checkCalculation();
         
        System.out.println(result);
    }
    
}

*/


/*

Code: from Towhid

package examevidence;

import evidence.DoSum;
import java.util.Scanner;

public class ExamEvidence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DoSum calculate = new DoSum();
        System.out.println("Enter First Number&quot￼;
        calculate.number1 = input.nextInt();
        System.out.println("Enter Second2 Number&quot￼;
        calculate.number2 = input.nextInt();

        System.out.println("Enter ur choise for sum=1,Subtraction=2,Multiple=3,Divide=4&quot￼;
        int userInput = input.nextInt();

        if (userInput == 1) {
            System.out.println("Result Is "+calculate.FindSum());
        } else if (userInput == 2) {
            System.out.println("Result Is "+calculate.FindSubtraction());
        } else if (userInput == 3) {
            System.out.println("Result Is "+calculate.FindMultiple());
        } else if (userInput == 4) {
            System.out.println("Result Is "+calculate.FindDivide());
        }

    }

}





(4:38 PM) package evidence;

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
