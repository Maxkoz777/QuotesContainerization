package com.example.quotescontainerization.service;

import com.example.quotescontainerization.model.Phrase;
import com.example.quotescontainerization.repository.PhraseRepository;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PhraseServiceTest {

    @Mock
    PhraseRepository phraseRepository;

    @InjectMocks
    PhraseService phraseService;

    Phrase phrase;

    @BeforeEach
    void setUp() {

        phrase = Phrase.builder()
                .text("Test text")
                .build();

    }

    @Test
    void getRandomJoke() {

        when(phraseRepository.getRandomJoke()).thenReturn(Optional.ofNullable(phrase));

        val joke = phraseService.getRandomJoke();

        assertAll(
                () -> verify(phraseRepository).getRandomJoke(),
                () -> assertTrue(joke.isPresent()),
                () -> assertEquals(joke.get(), phrase)
        );

    }

    @Test
    void getRandomQuote() {

        when(phraseRepository.getRandomQuote()).thenReturn(Optional.ofNullable(phrase));

        val quote = phraseService.getRandomQuote();

        assertAll(
                () -> verify(phraseRepository).getRandomQuote(),
                () -> assertTrue(quote.isPresent()),
                () -> assertEquals(quote.get(), phrase)
        );

    }
}