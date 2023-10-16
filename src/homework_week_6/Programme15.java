package homework_week_6;

/**
 * Program to swap two variables
 */

public class Programme15 {
    public static void main(String[] args) {

        // Two variables
        int a = 25;
        int b = 50;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the values
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}




