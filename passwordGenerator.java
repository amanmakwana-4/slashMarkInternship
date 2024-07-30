package BASIC;
import java.util.Random;
import java.util.*;
import java.util.Scanner;
public class passwordGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=";

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }

        return password.toString();
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the password length: ");
    int passwordLength;
    while (true) {
        try {
            passwordLength = scanner.nextInt();
            if (passwordLength <= 0) {
                System.out.println("Password length must be a positive integer. Please try again.");
                continue;
            }
            break;
        } catch (InputMismatchException e) {
            System.out.println("Password length must be an integer. Please try again.");
            scanner.next(); // Clear the invalid input
        }
    }

    String password = generatePassword(passwordLength);
    System.out.println("Generated Password : " + password);

    System.out.println("You like password or you want to generate another password\n1)Like password\n2)Want to change password");
    int choice;
    choice=scanner.nextInt();
    switch (choice) {
        case 1:
            System.err.println("I'm Happy to See that you like my generated Password");
            break;
        case 2:{
            main(args);
            break;
        }
        default:
            break;
    }
}
}
