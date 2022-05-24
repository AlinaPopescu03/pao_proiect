package com.example.booklendingsystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public non-sealed class Users extends GenericEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
//    private Role role;

    @OneToOne
    @JoinColumn(name="id")
    private Books book;

}
