package com.example.justaquote.controllers;

import com.example.justaquote.entities.Quote;
import com.example.justaquote.services.QuoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/daily")
    public ResponseEntity<Quote> getDailyQuote() {
		
		// Generating the daily quote
        Quote quote = quoteService.getDailyQuote();

        return ResponseEntity.ok(quote);
    }
}
