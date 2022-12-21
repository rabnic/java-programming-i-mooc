
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int limit = 100;


        while (true) {
            System.out.println("First: " + first + "/" + limit );
            System.out.println("Second: " + second + "/" + limit );

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            // Get command and amount
            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);
            
            // add command
            if (command.equals("add") && amount >= 0) {
                if (amount > limit || (first + amount) >= limit) {
                    first = limit;
                } else {
                    first += amount;
                }
            }
            
            // move command
            if (command.equals("move") && amount >= 0) {
                if (amount >= first) {
                    if ((second + first) > limit) {
                        System.out.println("passed here" + second + first);
                        second = limit;
                    } else {
                        second += first;
                    }
                    // Reset first
                    first = 0;
                } else {
                    if ((second + amount) > limit) {
                        System.out.println("passed " + second + amount);
                        second = limit;
                    } else {
                        second += amount;
                    }
                    // Deduct from first
                    first -= amount;
                }
            }
            
            // remove command
            if (command.equals("remove") && amount >= 0) {
                if (amount >= second) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }

        }
    }

}
