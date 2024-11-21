// Write a program that converts temperatures between Celsius and Fahrenheit.
import java.util.Scanner;

public class convertTemperature {
    public static double CelsiusToFahrenheit(double cel){
        double fah = (cel * 1.8) + 32;
        return fah;
    }
    public static double FahrenheitToCelsius(double fah){
        double cel = ((fah - 32)/9)*5;
        return cel;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Temperature value in Celsius: ");
        double val = input.nextDouble();
        double Fahrenheit = CelsiusToFahrenheit(val);
        System.out.print("Enter a Temperature value in Fahrenheit: ");
        double value = input.nextDouble();
        double Celsius = FahrenheitToCelsius(value);

        System.out.println("The Fahrenheit value: " + Fahrenheit);
        System.out.println("The Celsius value: " + Celsius);

        input.close();
    }
}
