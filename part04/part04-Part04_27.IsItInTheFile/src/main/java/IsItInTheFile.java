
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        boolean found = false;
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            // Read while there is more
            while(readFile.hasNextLine()) {
                //Read line
                String line = readFile.nextLine();
                if (line.equals(searchedFor)) {
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            return;
        }
        //
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found");
        }

    }
}
