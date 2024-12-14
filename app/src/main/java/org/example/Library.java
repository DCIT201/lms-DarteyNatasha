package org.example;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    // Creating the constructor for the Library class that creates a list to store Book objects
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the list
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book by title from the list
    public boolean removeBook(String title) {
        return books.removeIf(book -> book.getTitle().equals(title));
    }



    // Override the toString method to display the list of books in the library
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Library:\n");
        for (Book book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }


}
