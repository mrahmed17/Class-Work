package randompasswordgenarator;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenarator {

    public static void main(String[] args) {
/*
//Method: 1
        Scanner s=new Scanner(System.in);
        
        Random random = new Random();      
        System.out.println("Enter password length");
        int passLength=s.nextInt();
        
        String pass = "";
        String finalPassword="";

        //System.out.println(range);
        for (int i = 1; i <= passLength; i++) {
            
             int range = random.nextInt(3) + 1;
            switch (range) {
                case 1:
                    pass += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    pass += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    pass += (char) (random.nextInt(10) + 48);
                    break;
            }
        }

        for(int i=0; i<pass.length(); i++){            
            if (i==pass.length()/2){
                finalPassword +="_"+pass.charAt(i);
            }else{
                finalPassword +=pass.charAt(i);            
            }                
        }
               
        System.out.println(finalPassword);
        
        
        */



//Method: 2


/*
 Scanner s=new Scanner(System.in);
        
        Random random = new Random();      
        System.out.println("Enter password length");
        int passLength=s.nextInt();
        
        String pass = "";
        String finalPassword="";

        //System.out.println(range);
        for (int i = 1; i <= passLength; i++) {
            
             int range = random.nextInt(3) + 1;
            switch (range) {
                case 1:
                    pass += (char) (random.nextInt(26) + 65);

                    break;
                case 2:
                    pass += (char) (random.nextInt(26) + 97);

                    break;
                case 3:
                    pass += (char) (random.nextInt(10) + 48);

                    break;

            }

        }

        for(int i=0; i<pass.length(); i++){
            
            if (i==pass.length()/2){
                finalPassword +="_"+pass.charAt(i);
            }else{
                finalPassword +=pass.charAt(i);
            
            }
                
        }
        
        
        System.out.println(finalPassword);
        */
        
        //Method 3: Using Method Formula by sir

                Scanner s = new Scanner(System.in);

        System.out.println("Enter password length");
        int passLength = s.nextInt();
        
       String password= passGenarator(passLength);
        System.out.println("Password is:  "+password);

    }

    public static String passGenarator(int passLength) {
        Random random = new Random();
        String pass = "";
        String finalPassword = "";

        //System.out.println(range);
        for (int i = 1; i <= passLength; i++) {

            int range = random.nextInt(3) + 1;
            switch (range) {
                case 1:
                    pass += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    pass += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    pass += (char) (random.nextInt(10) + 48);
                    break;

            }

        }

        for (int i = 0; i < pass.length(); i++) {

            if (i == pass.length() / 2) {
                finalPassword += "_" + pass.charAt(i);
            } else {
                finalPassword += pass.charAt(i); // pass=ABCD1234
            }
        }
        return finalPassword;
        
    }

}