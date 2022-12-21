
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        String longest = "";
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int len = parts[0].length();
            sum += Integer.valueOf(parts[1]);
            if (len > longest.length()) {
                longest = parts[0];
            }
            count++;
        }
        System.out.println("Longest name:" + longest);
        System.out.println("Average of the birth years:" + (1.0 * sum/count));


    }
}
