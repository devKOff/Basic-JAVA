import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Divide 100 by the input number
            int result = 100 / number;
            System.out.println("Result of 100 / " + number + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter a valid number.");
        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}