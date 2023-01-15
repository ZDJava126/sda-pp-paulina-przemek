package com.sda.mode1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

   @Id
    private String username;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String email;


}
