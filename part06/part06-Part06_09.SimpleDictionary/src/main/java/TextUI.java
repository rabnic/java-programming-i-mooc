
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
public class TextUI {
    
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.dictionary = dict;
        this.scanner = scan;
    }
    
    public void start() {
        // Prompt a command
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String traslation = scanner.nextLine();
                
                dictionary.add(word, traslation);
                continue;
            }
            
            if (command.equals("search")) {
                System.out.println("To be translated: ");
                String word = scanner.nextLine();
                
                String result = dictionary.translate(word);
                
                if (result != null) {
                    System.out.println("Translation: " + dictionary.translate(word));
                } else {
                    System.out.println("Word " + word + " was not found");
                }
                continue;
            }
            
            // Unknown command prompt again
            System.out.println("Unknown command");
        }
        
        System.out.println("Bye bye!");
    
    }
    
    
}
