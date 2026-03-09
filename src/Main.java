import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ================== UC2 ==================
        // Hardcoded string check
        String hardcodedWord = "madam";

        String hardcodedReversed = new StringBuilder(hardcodedWord).reverse().toString();

        if (hardcodedWord.equals(hardcodedReversed)) {
            System.out.println("UC2 Result: \"" + hardcodedWord + "\" is a Palindrome ✅");
        } else {
            System.out.println("UC2 Result: \"" + hardcodedWord + "\" is NOT a Palindrome ❌");
        }

        System.out.println("----------------------------------");

        // ================== YOUR ORIGINAL CODE (UNCHANGED) ==================
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

        sc.close();//commit
    }
}