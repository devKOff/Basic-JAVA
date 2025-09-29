public class Student {
    // Instance variables
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object
        Student student1 = new Student("Alice", 20);
        // Call method
        student1.displayInfo();
    }
}