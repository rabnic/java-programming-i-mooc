
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countStart = Integer.valueOf(scanner.nextLine());
        int counter = countStart;
        
        while (counter <= 100) {
            System.out.println(counter);
            counter++;
        }

    }
}
