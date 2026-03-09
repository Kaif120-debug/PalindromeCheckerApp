iimport java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();

        // Normalize string (remove spaces & special characters, convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Apply palindrome logic
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}