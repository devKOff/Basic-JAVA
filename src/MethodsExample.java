public class MethodsExample {
    public static void main(String[] args) {
        // Call a method
        greet("Bob");
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);
    }

    // Method to print a greeting
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}