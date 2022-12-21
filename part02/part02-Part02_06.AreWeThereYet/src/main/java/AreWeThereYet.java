
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user integer input until 4 to stop execution
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            //Get if number is not 4 or else exit
            if (number == 4) {
                break;
            }
            System.out.println(number);
        }

    }
}
