
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for max number count
        int maxNum = Integer.valueOf(scanner.nextLine());
        
        // Count and print from 0 to maxNum
        for (int i = 0; i <= maxNum; i++ ) {
            System.out.println(i);
        }

    }
}
