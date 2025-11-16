package com.example.justaquote.entities;

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
    public Quote(String text) { text = this.text;}

    public Long getId() { return this.id; }
    public String getText() { return this.text; }

    public void setId(Long id) { this.id = id; }
    public void setText(String text) { this.text = text; }
	
		@Override
		public String toString(){
			return this.text; 
		}
}
