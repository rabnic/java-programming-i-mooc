
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        int to = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        if (from <= to) {
            for(; from <= to ;from++) {
                sum += from;
            }
        }
        
        System.out.println("The sum is " + sum);

    }
}
