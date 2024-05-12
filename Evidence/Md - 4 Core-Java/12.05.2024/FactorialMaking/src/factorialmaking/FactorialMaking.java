
package factorialmaking;

import java.util.Scanner;

public class FactorialMaking {

    public static void main(String[] args) {
     
        Scanner input=new Scanner(System.in);
            System.out.println("Enter any number for Factorial");
            
            long inputValue=input.nextLong();
            long doFactorial=1;
            
            for(int i=1; i<=inputValue; i++){
                   doFactorial *=i;
            }

            System.out.println("Your factorial result is "+ doFactorial);
        
    }  
        
    }

