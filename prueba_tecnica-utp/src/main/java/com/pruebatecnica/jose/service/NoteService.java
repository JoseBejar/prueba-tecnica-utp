package com.pruebatecnica.jose.service;
import com.pruebatecnica.jose.dto.Respuesta;
import com.pruebatecnica.jose.model.Note;

import java.util.List;

public interface NoteService {
 List<Note> listNote();
 String createNote(Note note);
 Respuesta deleteNote(String note);
 Respuesta updateNote(Note note);

}
