package org.example;

import org.example.Classes.Etudiant;
import org.example.Classes.Librarian;
import org.example.Classes.Library;
import org.example.Classes.Student;
import org.example.Exceptions.BookNotAvailableException;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws BookNotAvailableException {

        Etudiant e1 = new Etudiant(5,"Ali");

        Librarian lib1 = new Librarian(1,"John","jhon.com");
        Student student1 = new Student();
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            // Display the menu
            System.out.println("\nLibrary Menu:");
            System.out.println("=============");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Add Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            // Get user choice
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the book you want to add: ");
                    String bookName = sc.nextLine();
                    lib1.addBook(bookName);
                    break;

                case 2:
                    lib.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter the name of the book you want to borrow: ");
                    String bookName1 = sc.nextLine();
                    try {
                        student1.borrowBook(bookName1);
                    } catch (BookNotAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter the name of the book you want to return: ");
                    String bookName2 = sc.nextLine();
                    student1.returnBook(bookName2);
                    break;

                case 5:
                    System.out.println("Enter the name of the student you want to add: ");
                    String studentName = sc.nextLine();
                    lib1.addStudent(studentName);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

        } while (choice != 6); // Continue displaying the menu until user chooses to exit

        sc.close(); // Close the scanner to avoid resource leaks
    }


    }