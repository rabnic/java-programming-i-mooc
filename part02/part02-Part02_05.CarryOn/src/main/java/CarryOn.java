
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Run program until user inputs no
        while (true) {
            System.out.println("Shal we carry on?");
            String userInput = scanner.nextLine();
            if (userInput.equals("no")) {
                break;
            }
        }

    }
}
