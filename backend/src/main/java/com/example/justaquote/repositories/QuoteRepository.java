package com.example.justaquote.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.justaquote.entities.Quote;

public interface QuoteRepository extends CrudRepository<Quote, Long>{
}
