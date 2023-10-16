package homework_week_6;

/**
 * Declare one instance and one static variable.
 * Declare one instance method.
 * Declare one static method.
 * Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * Declare the Main method.
 * Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    int a = 25; // Instance variable
    static String name = "john"; // Static variable

    public void myMethod() {
        Programme3 n1 = new Programme3();
        System.out.println(n1.a);
    }

    public static void n2() {
        System.out.println(name);

    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.myMethod();
        n2();
    }

}
