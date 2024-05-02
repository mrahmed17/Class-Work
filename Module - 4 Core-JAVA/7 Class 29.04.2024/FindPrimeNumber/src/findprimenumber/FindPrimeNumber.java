package findprimenumber;

import java.util.Scanner;

public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pls enter Number");
        int number = s.nextInt();

       findPrime(number);
        
//doSum(20,20,30,40);
//doSum(20,40);
//doSum(20,40,30);
//System.out.println((char)65);

    }

    public static void findPrime(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not prime number");
        }

    }

    public static void doSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void doSum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
    
    public static void doSum(int... num1) {
        int sum=0;
        for(int a : num1){
            sum+=a;
                   
        }
        System.out.println(sum);
    }
    
    
}