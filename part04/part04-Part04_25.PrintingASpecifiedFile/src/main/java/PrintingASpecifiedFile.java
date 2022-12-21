
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Ask the user first for file name
        System.out.println("Which file should have its contents printed? ");
        String file = scanner.nextLine();
        // Try getting the file
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            // Check if end is reached
            while(readFile.hasNextLine()) {
                // Read the file
                String line = readFile.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }
}
