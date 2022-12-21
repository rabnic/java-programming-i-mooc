
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask integer from the user
        int number = Integer.valueOf(scanner.nextLine());
        
        // Calculate the square
        int square = number * number;
        
        // Print the result
        System.out.println(square);

    }
}
