import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // This is my first java programm


        System.out.println("Hello, world!");
        System.out.println("This is new world");

        /*
        variable are of two types first is primitive and other is  reference.
        types of datatype 1 int
                          2 double
                          3 char
                          4 boolean
                          5 string
                          6 array
                          7 object
        steps to creat integer are
        1 declaration
        2 assignment

        */
        //primitive datatype

        int age;
        age = 21;
        int year = 2025;


        double quantity = 12.8;
        double salary = 20000;
        double cgpa = 6.9;

        char gender = 'M';
        char grade = 'F';

        boolean isStudent = true;
        boolean notStudent = false;

        System.out.println(age);
        System.out.println("The year is "+ year);
        System.out.println("The quantity is "+ quantity);
        System.out.println("My gender is "+ gender);
        System.out.println("Rajesh is a student " + isStudent);
        System.out.println("Ramu is not a student " + notStudent);

        // if else statements
        if(isStudent){
            System.out.println("everyone is a student");
        }
        else{
            System.out.println("everyone is not a student");
        }


        //reference datatype
        //1 - string

        String name = "Raju";
        System.out.println("Are you a student " + name);

        // we will learn about other data type later
        // now lets try how we take input method in jave so
        // we use import.java.util.Scanner;

        // after that we say use

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String nName = scanner.nextLine();
        System.out.println("What is your age?");
        int nAge = scanner.nextInt();
        System.out.println("What is your CGPA?");
        double nCGPA = scanner.nextDouble();
        System.out.println("Student: ");
        boolean niStudent = scanner.nextBoolean();


        System.out.println("Your name is " + nName);
        System.out.println("Your age is " + nAge);
        System.out.println("Your CGPA is " + nCGPA);
        System.out.println("Student :  " + niStudent);

        //scanner1.close();




        scanner.close();





    }
}
