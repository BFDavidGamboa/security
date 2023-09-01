package com.david.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//This will create it's proper annotations
@Data
@Builder
//This will build and create its proper constructors
@NoArgsConstructor
//This will add the args to the constructor
@AllArgsConstructor
@Entity
//Is intended for use in the database
@Table(name = "_user")
//Will provide the database for this user
public class User {
    //This value table will crete a table based in the values provided by this annotation
    //There are other options as well
    //@GeneratedValue(strategy = GenerationType.TABLE)

    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
