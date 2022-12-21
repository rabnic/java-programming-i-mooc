

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    // Create a count down method with starting number parameter
    public static void printFromNumberToOne(int number) {
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }

}
