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
                            .text("— Милый, смотри, какое у меня отличное тело!\n" +
                                    "— Бл@, Петрович, где ты его взял?! Это что, мертвый бомж?!")
                            .type(PhraseType.JOKE)
                            .build(),
                    Phrase.builder().text("- Почему ты закрылся от меня? Я же слышу, как тебе одиноко, как ты стонешь внутри.\n" +
                                        "- Бл@, Петрович, отойди от двери, дай посрать спокойно!")
                            .type(PhraseType.JOKE)
                            .build(),
                    Phrase.builder().text("- А Саша выйдет?\n" +
                            "- Нет, у него пожизненное.")
                            .type(PhraseType.JOKE)
                            .build(),

                    // Quotes

                    Phrase.builder()
                            .text("Если волк молчит то лучше его не перебивай.")
                            .type(PhraseType.QUOTE)
                            .build(),
                    Phrase.builder()
                            .text("В жизни полно лжи и грязи, она не так красива. Даже твой лучший друг может не поделиться пивом…")
                            .type(PhraseType.QUOTE)
                            .build(),
                    Phrase.builder()
                            .text("Если в дверь не постучаться, ее никогда не откроют.")
                            .type(PhraseType.QUOTE)
                            .build()

            );

            phraseRepository.saveAll(phrases);
        }

        log.info("Phrases loaded: " + phraseRepository.count());

    }
}
