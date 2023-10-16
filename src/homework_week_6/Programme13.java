package homework_week_6;

import java.util.Scanner;

/**
 * Program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Programme13 {
    public static void main(String[] args) {

        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of the three numbers is: " + average);

        // Scanner closing
        scanner.close();
    }
}
