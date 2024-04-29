
package randompasswordgenerate;
import java.security.SecureRandom;

public class RandomPasswordGenerate {

    public static void main(String[] args) {
        int passwordLength = 9; 
        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }

    private static String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
       
        for (int i = 0; i < 4; i++) {
            password.append(random.nextInt(10)); 
        }

        password.append("_");

        for (int i = 0; i < 4; i++) {
            password.append(random.nextInt(10)); 
        }

        return password.toString();
    }
}


/*import java.security.SecureRandom;

public class SimplePasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 9; // You want a 9-digit password
        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }

    private static String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Generate the first 4 random digits
        for (int i = 0; i < 4; i++) {
            password.append(random.nextInt(10)); // Append a random digit (0-9)
        }

        // Add the underscore in the middle
        password.append("_");

        // Generate the last 4 random digits
        for (int i = 0; i < 4; i++) {
            password.append(random.nextInt(10)); // Append a random digit (0-9)
        }

        return password.toString();
    }
}

*/

