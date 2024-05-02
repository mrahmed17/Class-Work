
package loginmethod;

import java.util.Scanner;

public class LoginMethod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Pls enter user Name");
        String userName = s.nextLine();
        System.out.println("Pls enter Password");
        String pass = s.nextLine();

        doLogin(userName, pass);

    }

    public static void doLogin(String userName, String password) {

        if (userName.equalsIgnoreCase("java") && password.equals("java1234")) {
            System.out.println("Welcome " + userName);

        } else {
            System.out.println("User name or password is incorrect");

        }

    }

}