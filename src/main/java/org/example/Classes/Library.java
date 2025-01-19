package org.example.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Book;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Data
public class Library {

    static Set<String> books = new HashSet<>();
    static Set<String> Student = new HashSet<>();
    private CategoryBooks e1;

    public void displayBooks(){
        System.out.println("Books in the library are: ");
        if(books.isEmpty()){
            System.out.println("No books in the library");
        }
        else {
            for (String book :books) {
                System.out.println(book);
            }
        }
    }
}
