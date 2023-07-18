 import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();

        // Generate a random password using the user input
        String password = generateRandomPassword(name, email, mobileNumber);
        System.out.println("Generated Password: " + password);
    }

    private static String generateRandomPassword(String name, String email, String mobileNumber) {
        String password = "";

        // Combine user input
        String userInput = name + email + mobileNumber;

        // Convert user input to character array
        char[] charArray = userInput.toCharArray();

        // Generate random password using the character array
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(charArray.length);
            password += charArray[randomIndex];
        }

        return password;
    }
}
