package homework_week_6;

import java.util.Scanner;

/**
 * Program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programme7 {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Enter the temperature in Fahrenheit
        System.out.println("Enter temperature in Fahrenheit: ");

        // Read the temperature as a double
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in celsius is" + celsius);


        // Closing scanner
        scanner.close();
    }

}
