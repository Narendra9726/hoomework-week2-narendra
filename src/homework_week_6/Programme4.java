package homework_week_6;

/**
 * Declare two instance and two static variables.
 * Declare one instance method.
 * Declare one static method.
 * Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {
    int a = 10; // Instance variable
    String name = "Smith"; // Instance variable
    static String lastname = "John"; // Static variable
    static int n = 50; // Static variable

    public void w1() {
        Programme4 k1 = new Programme4();
        System.out.println(Programme4.lastname);
        System.out.println(Programme4.n);
        System.out.println(a);
        System.out.println(name);
    }

    public static void w2() {
        Programme4 d1 = new Programme4();
        d1.w1();
        System.out.println(d1.a);
        System.out.println(d1.name);

        System.out.println(lastname);
        System.out.println(n);
    }

    public static void main(String[] args) {
        w2();
    }
}
