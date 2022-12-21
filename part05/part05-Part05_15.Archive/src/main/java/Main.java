
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            Item item = new Item(identifier, name);
            
            if (name.isEmpty()) {
                break;
            }
            
            if (archive.contains(item)) {
                continue;
            }
            
            archive.add(item);

        }
        
        // Print the archive collection
        System.out.println("==Items==");
        for (Item item: archive) {
            System.out.println(item);
        }


    }
}
