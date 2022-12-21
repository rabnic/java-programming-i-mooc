
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase dbBirds = new BirdDatabase();
        
        while(true) {
                System.out.print("?");
                String command = scan.nextLine();
                
                // Quit
                if (command.equals("Quit")) {
                    break;
                }
                
                // Add
                if (command.equals("Add")) {
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    
                    System.out.print("Name in Latin: ");
                    String latinName = scan.nextLine();
                    
                    dbBirds.add(new Bird(name, latinName));
                }
                
                // One
                if (command.equals("One")) {
                    System.out.print("Bird? ");
                    String name = scan.nextLine();
                    
                    if (dbBirds.getBird(name) == null) {
                        continue;
                    } else {
                        System.out.println(dbBirds.getBird(name));
                    }
                }
                
                // All
                if (command.equals("All")) {
                    for(Bird bird: dbBirds.getAll()) {
                        System.out.println(bird);
                    }
                    
                }
                
                // Observation
                if (command.equals("Observation")) {
                    System.out.print("Bird?");
                    String name = scan.nextLine();
                    
                    if (!dbBirds.isObservedSuccess(name)) {
                        System.out.println("Not a bird!");
                    }
                }               
        }
    }
}
