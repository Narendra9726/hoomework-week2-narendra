package homework_week_6;

/**
 * Declare two instance variables.
 *    Declare one instance method.
 *    Call both instance variables into the instance method inside the print statement.
 *    Declare the Main method.
 *    Call the above instance method into the Main method and Run the programme.
 */
public class Programme1 {
    int a = 100; // a ia a Instance variable
    int b = 150; // b ia a Instance variable
    String name = "John"; // Instance variable
    public void m1() {
        Programme1 m1 = new Programme1();

        System.out.println(m1.a);
        System.out.println(m1.b);
        System.out.println(m1.name);
    }
    public static void main(String[] args) {
        Programme1 m2 = new Programme1();
        System.out.println(m2.a);
        System.out.println(m2.b);
        System.out.println(m2.name);

    }
}
