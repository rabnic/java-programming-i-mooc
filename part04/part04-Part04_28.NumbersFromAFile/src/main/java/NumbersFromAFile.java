
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNums = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        // Fetch the given file
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            // Read file while there is more
            while(readFile.hasNextLine()) {
                // Read the file
                int number = Integer.valueOf(readFile.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    countNums++;
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Result display
        System.out.println("Numbers: " + countNums);

    }

}
