
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Get the personal info until empty first name
        while(true) {
            //System.out.print("First name: ");
            String fname = scanner.nextLine();
            if (fname.isEmpty()) {
                break;
            }
            // Get last name and id
            //System.out.print("Last name: ");
            String lname = scanner.nextLine();
            //System.out.print("Identification number: ");
            String id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fname, lname, id));
        }
        
        // Print the first and last name only separated by a space
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
