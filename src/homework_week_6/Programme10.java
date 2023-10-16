package homework_week_6;

import java.util.Scanner;

/**
 * program that takes a number as input and prints its
 * multiplication table up to 10
 */

public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Print the multiplication
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));

            // scanner closing
            scanner.close();
        }
    }
}


