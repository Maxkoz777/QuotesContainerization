package com.example.quotescontainerization.service;

import com.example.quotescontainerization.model.Phrase;
import com.example.quotescontainerization.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PhraseService {

    PhraseRepository phraseRepository;

    @Autowired
    public PhraseService(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    public Optional<Phrase> getRandomJoke() {
        return phraseRepository.getRandomJoke();
    }

    public Optional<Phrase> getRandomQuote() {
        return phraseRepository.getRandomQuote();
    }

}
