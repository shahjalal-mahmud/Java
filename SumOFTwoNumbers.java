import java.util.Scanner;

public class SumOFTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int Num2 = input.nextInt();
        input.close();
        int Sum = Num1 + Num2;
        System.out.println("The SUm of two numbers: " + Sum);
    }
}
