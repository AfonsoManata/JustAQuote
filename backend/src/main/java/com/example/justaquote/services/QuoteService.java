package com.example.justaquote.services;

import com.example.justaquote.repositories.QuoteRepository;
import com.example.justaquote.entities.Quote;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuoteService {

    private final QuoteRepository quoteRepository;

    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    public Quote getRandomQuote() {
        return quoteRepository.findRandomQuote()
            .orElseThrow(() -> new RuntimeException("Error Finding the random quote."));
    }

}
