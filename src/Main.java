import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // ---------- Convert String to Linked List ----------
        Node head = null, tail = null;

        for (char c : cleaned.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // ---------- Find middle using slow & fast pointer ----------
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // ---------- Reverse second half ----------
        Node secondHalf = reverse(slow);

        // ---------- Compare halves ----------
        Node firstHalf = head;
        Node temp = secondHalf;
        boolean isPalindromeLL = true;

        while (temp != null) {
            if (firstHalf.data != temp.data) {
                isPalindromeLL = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // ---------- Your original code ----------
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed) && isPalindromeLL) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        sc.close();
    }
}