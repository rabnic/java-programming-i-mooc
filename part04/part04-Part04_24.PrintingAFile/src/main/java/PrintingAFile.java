
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(Paths.get("data.txt"))) {
            //
            while (scan.hasNextLine()) {
                // Read line by line
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error while reading file");
        }

    }
}
