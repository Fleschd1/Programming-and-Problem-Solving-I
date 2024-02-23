// Author Daniel Flesch
//Date: 02/21/24
// A Book Class with a title, author, publishing company (all Strings).
// Add a demo class with the main method and create two book objects using two different constructors (a no-argument and an argument constructor).
public class Book {
    
    private String title;
    private String author;
    private String publishingCompany;

    // A no-argument constructor.
    public Book() {
        title = "No Longer Human";
        author = "Osamu Dazai";
        publishingCompany = "New Directions Publishing Co.";
    }

    // An argument constructor.
    public Book(String title, String author, String publishingCompany) {
        this.title = title;
        this.author = author;
        this.publishingCompany = publishingCompany;
    }
    
    // Title methods
    public void setTitle(String t) {
        this.title = t;
    }
    public String getTitle() {
        return title;
    }

    // Author methods
    public void setAuthor(String a) {
        this.author = a;
    }
    public String getAuthor() {
        return author;
    }

    // Publishing Company methods
    public void setPublishingCompany(String pc) {
        this.publishingCompany = pc;
    }
    public String getPublishingCompany() {
        return publishingCompany;
    }
}
