/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicholas
 */
public class Book {
    
    private String author;
    private String title;
    private int pageCount;
    
    public Book(String author, String title, int numPages) {
        this.author = author;
        this.title = title;
        this.pageCount = numPages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.pageCount;
    }
    
    @Override
    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
    
    
    // J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages
    
}
