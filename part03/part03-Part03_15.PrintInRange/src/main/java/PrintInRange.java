
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        //
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(11);
        numbers.add(10);
        
        //
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        for (Integer number: list) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    } 
    
}
