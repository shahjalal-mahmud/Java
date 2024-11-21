// Write a program that checks if a given string is a palindrome (reads the same forwards and backwards).
import java.util.Scanner;


public class checkPalindrom {
    public static boolean isPalindrome(String str){
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = input.nextLine();
        if (isPalindrome(userInput)) {
            System.out.println("\"" + userInput + "\" is a palindrome.");
        } else {
            System.out.println("\"" + userInput + "\" is not a palindrome.");
        }
        input.close();
    }
}
