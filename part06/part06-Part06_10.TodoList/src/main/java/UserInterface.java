
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class UserInterface {
    
    private TodoList tasks;
    private Scanner scanner;
    
    
    public UserInterface( TodoList list, Scanner scan) {
        this.scanner = scan;
        this.tasks = list;
    }
    
    public void start() {
        
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                
                this.tasks.add(task);
            }
            
            if (command.equals("remove")) {
                System.out.println("To add: ");
                int taskNumber = Integer.valueOf(scanner.nextLine());
                
                this.tasks.remove(taskNumber);
            }
            
            if (command.equals("list")) {
                this.tasks.print();
            }
        }
    }
    
}
