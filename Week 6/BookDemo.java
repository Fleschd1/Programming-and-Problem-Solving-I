//Author Daniel Flesch
//Date: 02/21/24
// A demo class with the main method and two book objects using two different constructors (a no-argument and an argument constructor).

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Don Quixote", "Miguel de Cervantes", "Francisco de Robles");
        
        System.out.printf("%nBook 1: %s by %s published by %s%n", book1.getTitle(), book1.getAuthor(), book1.getPublishingCompany());
        System.out.printf("%nBook 2: %s by %s published by %s%n", book2.getTitle(), book2.getAuthor(), book2.getPublishingCompany());
    }
}