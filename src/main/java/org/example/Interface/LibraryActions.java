package org.example.Interface;

import org.example.Exceptions.BookNotAvailableException;

public interface LibraryActions {
    void borrowBook(String bookName) throws BookNotAvailableException;
    void returnBook(String bookName);


}
