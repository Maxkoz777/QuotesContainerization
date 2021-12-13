package com.example.quotescontainerization.bootstrap;

import com.example.quotescontainerization.model.Phrase;
import com.example.quotescontainerization.model.types.PhraseType;
import com.example.quotescontainerization.repository.PhraseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class InitialDataGenerator implements CommandLineRunner {

    PhraseRepository phraseRepository;

    @Autowired
    public InitialDataGenerator(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    @Override
    public void run(String... args) {
        if (phraseRepository.count() == 0) {

            List<Phrase> phrases = List.of(

                    // Jokes

                    Phrase.builder()
                            .text("Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.")
                            .type(PhraseType.JOKE)
                            .build(),
                    Phrase.builder().text("I only know 25 letters of the alphabet. I don't know y.")
                            .type(PhraseType.JOKE)
                            .build(),
                    Phrase.builder().text("Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.")
                            .type(PhraseType.JOKE)
                            .build(),

                    // Quotes

                    Phrase.builder()
                            .text("It is better to remain silent at the risk of being thought a fool, than to talk and remove all doubt of it.")
                            .type(PhraseType.QUOTE)
                            .build(),
                    Phrase.builder()
                            .text("The fool doth think he is wise, but the wise man knows himself to be a fool.")
                            .type(PhraseType.QUOTE)
                            .build(),
                    Phrase.builder()
                            .text("Knowing yourself is the beginning of all wisdom.")
                            .type(PhraseType.QUOTE)
                            .build()

            );

            phraseRepository.saveAll(phrases);
        }

        log.info("Phrases loaded: " + phraseRepository.count());

    }
}
