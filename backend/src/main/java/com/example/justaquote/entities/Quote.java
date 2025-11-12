package com.example.justaquote.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quote")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    @Column(nullable = false, length = 255)
    private String _text;

    public Quote() {}
    public Quote(String text) { _text = text;}

		@Override
		public String toString(){
			return _text; 
		}
}
