package com.example.justaquote.services;

import com.example.justaquote.repositories.QuoteRepository;
import com.example.justaquote.entities.Quote;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.RedisTemplate;
import java.util.List;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

@Service
public class QuoteService {

	private final QuoteRepository quoteRepository;
	private final RedisTemplate<String, Quote> redisTemplate;

	public QuoteService(
			QuoteRepository quoteRepository,
			RedisTemplate<String, Quote> redisTemplate
	) {
		this.quoteRepository = quoteRepository;
		this.redisTemplate = redisTemplate;
	}

	public List<Quote> getAllQuotes() {
		return quoteRepository.findAll();
	}

	public Quote getRandomQuote() {
		return quoteRepository.findRandomQuote()
			.orElseThrow(() -> new RuntimeException("Error Finding the random quote."));
	}

	public Quote getDailyQuote() {

		// 1️⃣ Generate Redis key based on current UTC date
		String today = LocalDate.now(ZoneOffset.UTC).toString();
		String redisKey = "quote:" + today;

		Quote cachedQuote = redisTemplate.opsForValue().get(redisKey);
		if (cachedQuote != null) {
			return cachedQuote; // cache hit
		}

		// 3️⃣ Cache miss → fetch random quote from DB
		Quote randomQuote = getRandomQuote();

		// 4️⃣ Calculate seconds until midnight UTC
		long secondsUntilMidnight = secondsUntilNextDay();

		// 5️⃣ Store in Redis with TTL until midnight
		redisTemplate.opsForValue()
			.set(redisKey, randomQuote, secondsUntilMidnight, TimeUnit.SECONDS);

		return randomQuote;
	}

	// Helper method to calculate seconds remaining until next UTC day
	private long secondsUntilNextDay() {
		LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
		LocalDateTime midnight = now.toLocalDate().plusDays(1).atStartOfDay();
		return Duration.between(now, midnight).getSeconds();
	}
}
