package org.example.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.Interface.LibraryActions;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Librarian extends User {

    private List<String> Book ;


    public Librarian(int id,String name, String email) {
        super(id,name, email);
    }

    public void addBook(String bookName) {
        Library.books.add(bookName);
        System.out.println("Book added successfully with name " + bookName+" by "+this.getName());
    }

    public void addStudent(String studentName) {
        Library.Student.add(studentName);
        System.out.println("Student added successfully with name " + studentName+" by "+this.getName());
    }

    public void removeBook(String bookName) {
        Library.books.remove(bookName);
        System.out.println("Book removed successfully with name " + bookName+" by "+this.getName());
    }

    public void removeStudent(String studentName) {
        Library.Student.remove(studentName);
        System.out.println("Student removed successfully with name " + studentName+" by "+this.getName());
    }

    public boolean searchStudent(String studentName) {
        if (Library.Student.contains(studentName)) {
            System.out.println("Student found with name: " + studentName);
            return true;
        } else {
            System.out.println("Student not found with name: " + studentName);
            return false;
        }
    }

}
