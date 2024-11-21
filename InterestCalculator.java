// Write a program that calculates simple interest based on user input for principal, rate of interest, and time.

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest in percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter the time: ");
        int time = input.nextInt();
        double interest = (principal * time * rate)/100;
        System.out.println("The Simple Interest: " + interest);
        input.close();
    }
}
