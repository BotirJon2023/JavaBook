package org.example;

import java.util.Scanner;

public class Main {

    public static class LibrarySystem {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            LibrarySystemWithBookAndUser.Book book1 = new LibrarySystemWithBookAndUser.Book("1984", "George Orwell");
            LibrarySystemWithBookAndUser.Book book2 = new LibrarySystemWithBookAndUser.Book("To Kill a Mockingbird", "Harper Lee");

            LibrarySystemWithBookAndUser.User user = new LibrarySystemWithBookAndUser.User("John Doe");

            System.out.println("Welcome to the library system.");

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Borrow Book");
                System.out.println("2. Return Book");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Which book would you like to borrow?");
                    System.out.println("1. 1984");
                    System.out.println("2. To Kill a Mockingbird");
                    int bookChoice = scanner.nextInt();

                    if (bookChoice == 1) {
                        user.borrowBook(book1);
                    } else if (bookChoice == 2) {
                        user.borrowBook(book2);
                    } else {
                        System.out.println("Invalid option.");
                    }
                } else if (choice == 2) {
                    System.out.println("Which book would you like to return?");
                    System.out.println("1. 1984");
                    System.out.println("2. To Kill a Mockingbird");
                    int returnChoice = scanner.nextInt();

                    if (returnChoice == 1) {
                        user.returnBook(book1);
                    } else if (returnChoice == 2) {
                        user.returnBook(book2);
                    } else {
                        System.out.println("Invalid option.");
                    }
                } else if (choice == 3) {
                    System.out.println("Thank you for using the library system.");
                    break;
                } else {
                    System.out.println("Invalid option.");
                }
            }

            scanner.close();
        }
    }

}