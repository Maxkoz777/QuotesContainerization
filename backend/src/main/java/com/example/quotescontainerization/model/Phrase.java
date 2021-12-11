package com.example.quotescontainerization.model;

import com.example.quotescontainerization.model.phraseTypes.PhraseType;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Phrase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(columnDefinition = "text", nullable = false)
    private String text;

    @Column(nullable = false)
    private PhraseType type;

}
