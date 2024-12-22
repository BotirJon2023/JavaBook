package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystemWithBookAndUser {

    static class Book {
        String title;
        String author;
        boolean isAvailable;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public void borrow() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("You borrowed the book: " + title);
            } else {
                System.out.println("Sorry, the book is not available.");
            }
        }

        public void returnBook() {
            isAvailable = true;
            System.out.println("You returned the book: " + title);
        }
    }

    static class User {
        String name;
        ArrayList<Book> borrowedBooks;

        public User(String name) {
            this.name = name;
            this.borrowedBooks = new ArrayList<>();
        }

        public void borrowBook(Book book) {
            if (book.isAvailable) {
                borrowedBooks.add(book);
                book.borrow();
            } else {
                System.out.println("Book not available for borrowing.");
            }
        }

        public void returnBook(Book book) {
            if (borrowedBooks.contains(book)) {
                borrowedBooks.remove(book);
                book.returnBook();
            } else {
                System.out.println("You did not borrow this book.");
            }
        }
    }


}
