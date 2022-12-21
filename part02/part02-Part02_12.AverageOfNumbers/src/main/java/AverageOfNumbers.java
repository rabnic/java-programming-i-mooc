
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            double number = Double.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            count = count + 1;
            sum = sum + number;
        }
        
        double average = sum / count;
        System.out.println("Average of the numbers: " + average);

    }
}
