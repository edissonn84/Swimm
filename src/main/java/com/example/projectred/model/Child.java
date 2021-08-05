package com.example.projectred.model;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long childID;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Category category;
}
