package com.example.justaquote.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import com.example.justaquote.entities.Quote;
import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote, Long>{

	@Query(value = "SELECT * FROM quotes ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
  Optional<Quote> findRandomQuote();
}
