package com.example.justaquote.model;

import jakarta.persistence.*;

@Entity
@Table(name = "quote")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String text;

    public Quote() {}
    public Quote(String text) { this.text = text;}

}
