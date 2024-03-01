package com.pruebatecnica.jose.controller;
import com.pruebatecnica.jose.dto.Respuesta;
import com.pruebatecnica.jose.model.Note;
import com.pruebatecnica.jose.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/note")
public class NoteController {
    @Autowired
    NoteService noteService;


    @GetMapping(value = "/list")
    ResponseEntity<List<Note>> listNote() {
        return ResponseEntity
                .ok()
                .body( noteService.listNote());
    }

    @PostMapping("/create")
    ResponseEntity<Respuesta> createNote(@RequestBody Note note) {
        String message = noteService.createNote(note);
        return ResponseEntity.ok(Respuesta
                .builder().status(HttpStatus.OK)
                .message(message)
                .payload(new HashMap<>()).build());
    }
    @DeleteMapping("/{idNote}")
    ResponseEntity<Respuesta> deleteNote( @PathVariable("idNote") String note ) {
        noteService.deleteNote(note);
        String message =  "Eliminado exitosamente"+note;
        return ResponseEntity.ok(Respuesta
                .builder().status(HttpStatus.OK)
                .message(message)
                .payload(new HashMap<>()).build());
    }
    @PutMapping
    ResponseEntity<Respuesta> updateNote(@RequestBody Note note) {
        noteService.updateNote(note);
        String message =  "Actualizado exitosamente";
        return ResponseEntity.ok(Respuesta
                .builder().status(HttpStatus.OK)
                .message(message)
                .payload(new HashMap<>()).build());
    }



}


