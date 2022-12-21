
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("");
        RecipeUI.start(scanner, file);

    }

}
