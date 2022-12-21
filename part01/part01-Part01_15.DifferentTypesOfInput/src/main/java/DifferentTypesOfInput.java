
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String name = scan.nextLine();
        System.out.println("Give an integer: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double price = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean isDone = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + age);
        System.out.println("You gave the double " + price);
        System.out.println("You gave the boolean " + isDone);

    }
}
