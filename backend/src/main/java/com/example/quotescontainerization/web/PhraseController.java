package com.example.quotescontainerization.web;

import com.example.quotescontainerization.model.Phrase;
import com.example.quotescontainerization.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return new ResponseEntity<>(phraseService.getRandomJoke().get(), HttpStatus.OK);
    }

    @GetMapping("/quote")
    public ResponseEntity<Phrase> getRandomQuote() {
        return new ResponseEntity<>(phraseService.getRandomQuote().get(), HttpStatus.OK);
    }

}
