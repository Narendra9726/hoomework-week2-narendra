package homework_week_6;

import java.util.Scanner;

/**
 * Program to print the area and perimeter of a rectangle
 */

public class Programme14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the rectangle:");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        // Display the result
        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);

        // Closing the scanner
        scanner.close();
    }
}
