package homework_week_6;

import java.util.Scanner;

/**
 * Program to calculate the area of a triangle.
 */

public class Programme8 {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Enter a base of triangle
        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();

        // Enter the height of the triangle
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of the triangle is: " + area);

        // Closing scanner
        scanner.close();
    }
}
