import java.util.Scanner;


public class MadLibsGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String adjective1;
        String adjective2;
        String noun1;
        String noun2;
        String verb1;

        System.out.print("Enter adjective 1: ");
        adjective1 = sc.nextLine();
        System.out.print("Enter adjective 2: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter noun1: ");
        noun1 = sc.nextLine();
        System.out.print("Enter noun2: ");
        noun2 = sc.nextLine();
        System.out.print("Enter verb1: ");
        verb1 = sc.nextLine();

        System.out.print(verb1 + " both are animals but " + noun1 +" runs " +adjective1 + " and " + noun2 +" runs "+ adjective2 );

        sc.close();
    }
}
