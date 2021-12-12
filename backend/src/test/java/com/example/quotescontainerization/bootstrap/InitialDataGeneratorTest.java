package com.example.quotescontainerization.bootstrap;

import com.example.quotescontainerization.repository.PhraseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InitialDataGeneratorTest {

    @Mock
    PhraseRepository phraseRepository;

    @InjectMocks
    InitialDataGenerator generator;

    @Test
    void run() {

        when(phraseRepository.count()).thenReturn(0L);

        generator.run();

        verify(phraseRepository, times(2)).count();

    }
}