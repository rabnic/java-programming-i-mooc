
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int factorial = 1;
        
        System.out.println("Last number: ");
        int upper = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= upper; i++) {
            factorial *= i;
        }
        
        System.out.println("The sum is " + factorial);

    }
}
