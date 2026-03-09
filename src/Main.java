import java.util.*;

public class Main {

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Deque Method
    public static boolean dequeMethod(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Normalize string
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // -------- Reverse Method Timing --------
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(cleaned);
        long end1 = System.nanoTime();

        // -------- Deque Method Timing --------
        long start2 = System.nanoTime();
        boolean result2 = dequeMethod(cleaned);
        long end2 = System.nanoTime();

        // -------- Results --------
        System.out.println("\nResults:");
        System.out.println("Reverse Method: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Method: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}