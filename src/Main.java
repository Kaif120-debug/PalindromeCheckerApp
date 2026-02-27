import java.util.Scanner;

public class Main {

    // Application constants (UC1 Requirement)
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    public static void main(String[] args) {

        // ===== UC1: Application Entry & Welcome Message =====
        System.out.println("=====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("=====================================");

        // ===== Continue to Palindrome Use Case =====
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}