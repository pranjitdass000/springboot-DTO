package com.stackroute.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String username;

    @Column(name="first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;
    private String password;
    private String email;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "location_id")
    private Location location;


}
