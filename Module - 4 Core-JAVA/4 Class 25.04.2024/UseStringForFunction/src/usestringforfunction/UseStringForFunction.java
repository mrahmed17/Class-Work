/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usestringforfunction;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UseStringForFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // facebook log in interface making with user name length validation
        Scanner s = new Scanner(System.in);

        System.out.println("Email address or phone number");
        String userName = s.nextLine();
        System.out.println("Password");
        String password = s.next();

        String message = String.format("Welcome to Facebook, %s", userName);
        String error = String.format("User Name must have 4 to 10 Character", userName);

        if (userName.length() > 10) {
            userName = userName.substring(3, 10);
            System.out.println(error);
            if (userName.equalsIgnoreCase("raju") && password.equals("Raju123")) {
                System.out.println(message);
            }
            else {
                System.out.println("Wrong credentials\n" 
                        + "Invalid username or password");
            }

        }
          
    }
    }