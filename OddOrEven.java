// Create a program that asks the user for an integer and determines whether it is odd or even.

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a Number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " Its a Even Number.");
        } else {
            System.out.println(num + " Its a Odd Number.");
        }
        input.close();
    }

}
