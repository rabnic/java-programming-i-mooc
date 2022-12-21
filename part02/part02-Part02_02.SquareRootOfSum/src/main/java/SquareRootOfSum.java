
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get two integers from the user
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        // Calculate the square root of the sum of the given integers
        int sum = first + second;
        double squareRoot = Math.sqrt(sum);
        
        // Print the square root to the console
        System.out.println(squareRoot);
      

    }
}
