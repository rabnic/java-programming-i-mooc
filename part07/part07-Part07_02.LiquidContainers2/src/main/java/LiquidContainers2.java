
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.println("First:" + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            // Get command and amount
            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);
            
            // add command
            if (command.equals("add") && amount >= 0) {
                first.add(amount);
            }
            
            // move command
            if (command.equals("move") && amount >= 0) {
                int initialFirst = first.contains();
                first.remove(amount);
                if (first.contains() == 0) {
                    second.add(initialFirst);
                } else {
                    second.add(amount);
                }
                
            }
            
            // remove command
            if (command.equals("remove") && amount >= 0) {
                second.remove(amount);
                
            }

        }

    }
}
