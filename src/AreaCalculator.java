import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        So lets try to make a project to calculate the area of rectangle.
        */

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle: " + area);

        scanner.close();
    }
}
