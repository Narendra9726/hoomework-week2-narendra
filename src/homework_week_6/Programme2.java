package homework_week_6;

/**
 * Declare two static variables
 * Declare one static method
 * Call both static variables into the static method inside the print statement.
 * Declare the Main method.
 * Call the static method into the Main method and Run the programme.
 */

public class Programme2 {
    static int a = 10; // Static variable
    static String name = "John"; // Static variable
    public static void a1(){
        System.out.println(name);
        System.out.println(a);
    }

    public static void main(String[] args) {
        a1();
    }
}
