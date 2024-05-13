package teststring;

import java.util.Scanner;
import javax.swing.text.PasswordView;

public class TestString {

    public static void main(String[] args) {

// Like google log in interface making
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter Your Email ID");
//        String userEmail = s.next();
//        String message = String.format("Welcome %s to google", userEmail);
//        
//        if (userEmail.equalsIgnoreCase("java")){
//
//              System.out.println("Enter Your Password");
//
//             String password=s.next();
//
//             if (password.equals("Java1234")){
//
//                 System.out.println(message);
//             }
//             else{
//                 System.out.println("Incorrect password");
//             }
//             
//        }
//        else{
//            System.out.println("Couldn't find your Google Account");
//        }
// Practice it again
//        Scanner s= new Scanner(System.in);
//        
//        System.out.println("Enter your email address");
//        
//        String userEmail=s.next();
//        String message= String.format("Welcome %s to Google",userEmail);
//        
//        if (userEmail.equalsIgnoreCase("java")){
//            System.out.println("Enter your password");
//            String password=s.next();
//            if (password.equals("Java1234")){
//                System.out.println(message);
//            }
//            
//            else{
//                System.out.println("Incorrect password");            
//            }
//        
//        }
//        else{
//            System.out.println("Couldn't find your Google Account");
//        }
//practice again
//
//Scanner s=new Scanner(System.in);
//        System.out.println("Please enter your email id");
//        String userEmail=s.next();
//        String message=String.format("Welcome %s to Google",userEmail);
//        if (userEmail.equalsIgnoreCase("java")){
//            System.out.println("Please enter your password");
//            String password=s.next();
//            if (password.equals("Java123")){
//                System.out.println(message);
//            }
//            
//            else{
//                System.out.println("Incorrect password");
//            }
//            
//        }
//               else{
//            System.out.println("Couldn't find your Google Account");
//        }
// Like facebook log in interface making
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Email address or phone number");
//        String userEmail = s.next();
//        System.out.println("Password");
//        String password = s.next();
//
//        String message = String.format("Welcome to Facebook, %s", userEmail);
//
//        if (userEmail.equalsIgnoreCase("raju") && password.equals("Raju123")) {
//            System.out.println(message);
//        } else {
//            System.out.println("Wrong credentials\n" + "Invalid username or password");
//        }
//Welcome name making critical formate
//Scanner r=new Scanner(System.in);
//System.out.println("Enter your name");
//String name=r.nextLine();
//String message=String.format("Welcome %s",name);
// 
//if(name.equalsIgnoreCase("Raju")){
//    System.out.println(message);
//}
//else {
//    System.out.println("Sorry, Wrong name");}
//Easy formate Welcome name making 
//        Scanner r= new Scanner(System.in);
//        System.out.println("Enter your name");
//        String userName=r.nextLine();
//        System.out.println("Welcome " + userName);
//
//
//Name Start with the Vowel or Consonent
        Scanner r = new Scanner(System.in);

        System.out.println("Enter your name");
        String userName = r.nextLine().toUpperCase();

        if (userName.startsWith("A") || userName.startsWith("E") || userName.startsWith("I") || userName.startsWith("O") || userName.startsWith("U")) {
            System.out.println(userName + " is start with Vowel");
        } else {
            System.out.println(userName + " is start with Consonent");
        }
        
        
    }

}
