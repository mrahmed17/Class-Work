package fahrenheittocelsiusclass23april;

import java.util.Scanner;

public class FahrenheitToCelsiusClass23April {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter Temparature in Fahrenheit: ");
//
//        float fahrenheit = input.nextFloat();
//
////      float result=(5.0 / 9) * (fahrenheit - 32);  // from books formula
//        float result = ((fahrenheit - 32) / 9) * 5;  // by Classmate providing formula
//
//        System.out.println("Temparature in Celsius: " + result);

//Practice again
Scanner input= new Scanner(System.in);
        
System.out.println("Please Enter Temparature in Fahrenheit: ");
        
    float fahrenheit = input.nextFloat();
        
   float result = ((fahrenheit-32)/9)*5;
        System.out.println("Temparature in Celsius: " + result);

    }

}
