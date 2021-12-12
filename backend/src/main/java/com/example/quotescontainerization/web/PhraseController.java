package com.example.quotescontainerization.web;

import com.example.quotescontainerization.model.Phrase;
import com.example.quotescontainerization.model.types.PhraseType;
import com.example.quotescontainerization.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PhraseController {

    PhraseService phraseService;

    @Autowired
    public PhraseController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @GetMapping("/joke")
    public ResponseEntity<Phrase> getRandomJoke() {
        var joke = phraseService.getRandomJoke();
        var defaultJoke = Phrase.builder()
                .text("This is default joke. Unable to find something funnier(")
                .type(PhraseType.JOKE)
                .build();
        return joke.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok(defaultJoke));
    }

    @GetMapping("/quote")
    public ResponseEntity<Phrase> getRandomQuote() {
        var quote = phraseService.getRandomQuote();
        var defaultQuote = Phrase.builder()
                .text("This is default quote. Unable to find something wiser(")
                .type(PhraseType.QUOTE)
                .build();
        return quote.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok(defaultQuote));
    }

}
