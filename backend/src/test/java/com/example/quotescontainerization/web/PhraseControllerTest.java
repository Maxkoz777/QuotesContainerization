package com.example.quotescontainerization.web;

import com.example.quotescontainerization.model.Phrase;
import com.example.quotescontainerization.service.PhraseService;
import lombok.val;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PhraseControllerTest {

    @Mock
    PhraseService service;

    @InjectMocks
    PhraseController controller;

    Phrase phrase;

    @BeforeEach
    void setUp() {
        phrase = Phrase.builder().text("Test text").build();
    }

    @Test
    void getRandomJoke() {
        when(service.getRandomJoke()).thenReturn(Optional.ofNullable(phrase));

        val joke = controller.getRandomJoke();

        assertAll(
                () -> verify(service).getRandomJoke(),
                () -> assertEquals(joke.getBody(), phrase)
        );
    }

    @Test
    void getRandomQuote() {

        when(service.getRandomQuote()).thenReturn(Optional.ofNullable(phrase));

        val quote = controller.getRandomQuote();

        assertAll(
                () -> verify(service).getRandomQuote(),
                () -> assertEquals(quote.getBody(), phrase)
        );

    }
}