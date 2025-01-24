package Streams.StringPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String string = "cac";
        String rev = ""; // Initialize without an extra space

        // Reverse the string
        for (int i = string.length() - 1; i >= 0; i--) {
            rev = rev + string.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed String: " + rev);

        // Check if the original string is equal to the reversed string
        if (string.equals(rev)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
