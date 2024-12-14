/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {

        //Creating 2 instances of the book class
        Book book1 = new Book("love in the deep", "Sylus", 2024 );
        Book book2 = new Book("The Extraction", "Cyril Banks", 2006 );


        // Creating an instance of the library to store the 2 books above
        Library library = new Library();

        // Adding book1 and book2 to library1
        library.addBook(book1);
        library.addBook(book2);


        // Listing all the books in library1
        System.out.println(library);

    }
}
