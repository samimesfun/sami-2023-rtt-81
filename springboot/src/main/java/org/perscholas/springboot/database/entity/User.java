package org.perscholas.springboot.database.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Setter
//@Getter
//@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="email")
    private String email;
}
