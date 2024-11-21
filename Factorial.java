// Implement a program that calculates the factorial of a given number using both iterative and recursive methods.
import java.util.Scanner;

public class Factorial {
    public static long factorialIterative(int n){
        long result = 1;
        for(int i = 2; i<=n; i++ ){
            result *= i;
        }
        return result;
    }
    public static long factorialRecursive(int n){
        if (n == 0 || n==1) {
            return 1;
        }
        return n * factorialRecursive(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        long iterativeResult = factorialIterative(num);
        System.out.println("The result of Iterative: " + iterativeResult);

        long recursiveResult = factorialRecursive(num);
        System.out.println("The result of Recursive: " + recursiveResult);

        input.close();
    }
}
