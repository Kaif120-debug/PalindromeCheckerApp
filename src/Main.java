import java.util.Scanner;

public class Main {

    // Recursive function to check palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare start and end characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // -------- Recursive Check --------
        boolean recursiveResult = isPalindromeRecursive(cleaned, 0, cleaned.length() - 1);

        // -------- Your Original Code --------
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed) && recursiveResult) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}