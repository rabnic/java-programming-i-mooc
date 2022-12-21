
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give numbers:");
        //int userInput = 0;
        int sum = 0;
        int count = 0;
        int odds = 0;
        int evens = 0;
        
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            sum += userInput;
            count++;
            //
            if (userInput % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        
        // Ending message
        System.out.println("Thx! Bye!");
        if (count > 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + count);
            System.out.println("Average: " + ((double)sum / count));
            System.out.println("Even: " + evens);
            System.out.println("Odd: " + odds);
        }

    }
}
