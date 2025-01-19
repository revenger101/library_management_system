package org.example.Classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.Exceptions.BookNotAvailableException;
import org.example.Interface.LibraryActions;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Student extends User implements LibraryActions {

    private List<String> borrowedBooks = new ArrayList<>();



    @Override
    public void borrowBook(String bookName) throws BookNotAvailableException {
        if(Library.books.contains(bookName)){
            borrowedBooks.add(bookName);
            Library.books.remove(bookName);
            System.out.println("Book borrowed successfully with name " + bookName );
        }
        else {
            throw new BookNotAvailableException("Book not available in the library");
        }

    }

    @Override
    public void returnBook(String bookName) {
        borrowedBooks.remove(bookName);
        Library.books.add(bookName);
        System.out.println("Book returned successfully with name " + bookName + " by " + this.getName());
    }




}
