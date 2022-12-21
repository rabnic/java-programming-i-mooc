
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        // Open the file for reading
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            // Read from the file
            while(readFile.hasNextLine()) {
                String line = readFile.nextLine();
                // Split the line into appropriate sections
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                // lily, age: 3 years
                System.out.print(name +", age: " + age);
                if (age == 1) {
                    System.out.println(" year");
                } else {
                    System.out.println(" years");
                }
    
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
