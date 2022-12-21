
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input that is a number
        int number =  Integer.valueOf(scanner.nextLine());
        
        // Print an absolute value of the given number
        if (number < 0) {
            int absoluteNumber = number * -1;
            System.out.println(absoluteNumber);
        } else {
            System.out.println(number);
        }
        

    }
}
