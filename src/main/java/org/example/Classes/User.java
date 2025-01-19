package org.example.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.Exceptions.BookNotAvailableException;
import org.example.Interface.LibraryActions;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class User{

    private int id;
    private String name;
    private String email;

    public String getDetails(){
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }


}
