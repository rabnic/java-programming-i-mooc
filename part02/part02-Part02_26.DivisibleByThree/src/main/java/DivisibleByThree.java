
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(3, 6);

    }
    
    // Method definition
    public static void divisibleByThreeInRange(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
