
package testbreakandcontinuefunction;

import java.util.Scanner;

public class TestBreakAndContinueFunction {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
      
        int sum=0;
        
        while(true){
              System.out.println("Enter Value");
        int userInput=r.nextInt();
        sum +=userInput;
        if(sum>=200){}
        else if(sum>=100) {
        continue;
        }
            System.out.println("The sum is "+sum);
        
        }
        
        
    }
    
}
