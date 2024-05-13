
package checkprimenumberusingclass.object;

import checkprimenumber.CheckPrimeNumber;

public class CheckPrimeNumberUsingClassObject {

  
    public static void main(String[] args) {
   
        CheckPrimeNumber pn=new CheckPrimeNumber(9);
        String message =pn.getPrimeNumber();
                
        System.out.println(message);
        
        
    }
    
}
