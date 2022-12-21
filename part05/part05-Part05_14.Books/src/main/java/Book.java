
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared) {
        // If the objects are at the same location, return true;
        if (this == compared) {
            return true;
        }
        
        // Return false comapared is not of type Book
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // Convert compared to Book type
        Book comparedBook = (Book) compared;
        
        // If the values are the same then return true;
        if (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        
        // Return false if all fails
        return false;
    }

}
