
package randompasswordgenerate;

import java.security.SecureRandom;

public class RandomPasswordGenerateWithAlphaberAndNumber {
    /* 
 //   Method -1:
    
    public static void main(String[] args) {
       int passwordLength = 9; // You want a 9-character password
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

        // Add the underscore
        password.append("_");

        // Generate the last 4 random letters (uppercase or lowercase)
        for (int i = 0; i < 4; i++) {
            char randomLetter = getRandomLetter(random);
            password.append(randomLetter);
        }

        return password.toString();
    }

    private static char getRandomLetter(SecureRandom random) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomIndex = random.nextInt(alphabet.length());
        return alphabet.charAt(randomIndex);
    }
}

*/
    
    
 //   Method -2:

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+=<>?";

    public static void main(String[] args) {
        int passwordLength = 12; // You can adjust the desired password length

        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }

    private static String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // Add random lowercase letters
        password.append(getRandomCharacters(LOWERCASE, 2));

        // Add random uppercase letters
        password.append(getRandomCharacters(UPPERCASE, 2));

        // Add random digits
        password.append(getRandomCharacters(DIGITS, 2));

        // Add random special characters
        password.append(getRandomCharacters(SPECIAL_CHARACTERS, 2));

        // Fill the remaining length with random characters
        while (password.length() < length) {
            String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
            password.append(getRandomCharacters(allCharacters, 1));
        }

        // Shuffle the password to make it more random
        for (int i = 0; i < password.length(); i++) {
            int randomIndex = random.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(randomIndex));
            password.setCharAt(randomIndex, temp);
        }

        return password.toString();
    }

    private static String getRandomCharacters(String characters, int count) {
        StringBuilder result = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(characters.length());
            result.append(characters.charAt(randomIndex));
        }
        return result.toString();
    }
}

