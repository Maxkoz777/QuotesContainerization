package com.example.quotescontainerization.repository;

import com.example.quotescontainerization.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {

    @Query(value = "SELECT * from phrase p " +
            "where p.type = 'JOKE' " +
            "order by RANDOM()" +
            "limit 1",
            nativeQuery = true)
    Optional<Phrase> getRandomJoke();

    @Query(value = "SELECT * from phrase p " +
            "where p.type = 'QUOTE' " +
            "order by RANDOM()" +
            "limit 1",
            nativeQuery = true)
    Optional<Phrase> getRandomQuote();

}
