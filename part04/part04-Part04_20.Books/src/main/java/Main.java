import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList();
        
        while(true) {
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            // Get pages and year
            int pages = Integer.valueOf(scan.nextLine());
            int year = Integer.valueOf(scan.nextLine());
            // Create book object and add to list
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String whatToPrint = scan.nextLine();
        if (whatToPrint.contains("everything")) {
            for(Book book: books) {
                System.out.println(book);
            }
        } else if (whatToPrint.contains("name")) {
            for(Book book: books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
