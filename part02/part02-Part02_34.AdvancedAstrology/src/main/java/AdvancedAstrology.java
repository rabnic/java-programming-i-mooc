
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        // Line break
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        //int row = 1;
        for (int row = 1; row <= size; row++) {
            printSpaces(size - row);
            printStars(row);
        }
    }
    
    public static void christmasTree(int height) {
        // part 3 of the exercise
        int stars = -1;
        for (int row = 1; row <= height; row++) {
            printSpaces(height - row);
            stars += 2;
            printStars(stars);
        }
        
        // Draw the base of the tree
        for (int i = 0; i < 2; i++) {
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
