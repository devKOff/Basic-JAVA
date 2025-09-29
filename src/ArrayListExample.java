import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access an element
        System.out.println("First fruit: " + fruits.get(0));

        // Loop through ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}