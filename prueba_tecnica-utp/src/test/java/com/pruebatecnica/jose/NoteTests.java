package com.pruebatecnica.jose;

import com.pruebatecnica.jose.model.Note;
import com.pruebatecnica.jose.repository.NoteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NoteTests {
    @Autowired
    private NoteRepository noteRepository;

    @Test
    public void testSaveClient(){
        Note notes = new Note();
        notes.setNote("10");
        notes.setIduser(Long.valueOf(1));
        Note savedClient = noteRepository.save(notes);
    }
}