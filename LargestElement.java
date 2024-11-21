import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] arr = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize max to the first element
        int max = arr[0];

        // Loop through the array to find the largest number
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output the largest number
        System.out.println("The largest number in the array is: " + max);
        
        scanner.close();
    }
}
