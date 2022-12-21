
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt user for their name
        System.out.println("What's your name? ");
        // Get user name
        String name = scanner.nextLine();
        // Greet the user by name
        System.out.println("Hi " + name);

    }
}
