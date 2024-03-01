package com.pruebatecnica.jose.service.Impl;
import com.pruebatecnica.jose.dto.Respuesta;
import com.pruebatecnica.jose.model.*;
import com.pruebatecnica.jose.repository.NoteRepository;
import com.pruebatecnica.jose.repository.UserRepository;
import com.pruebatecnica.jose.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository NoteRepository;

    @Autowired
    private UserRepository UserRepository;

    public List<Note> listNote() {

        return NoteRepository.findAll();
    }

    public String createNote(Note note) {
        try {
            List<User> user =  UserRepository.findAll();
            List<User> filter = user
                    .stream()
                    .filter(c -> c.getId() == note.getIduser())
                    .collect(Collectors.toList());
            if (filter.size()!=0) {
                NoteRepository.save(note);
                return "Creado correctamente";
            } else  {
                return "No se encuentra registro con ese ID";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Respuesta deleteNote(String note) {

        return null;
    }

    public Respuesta updateNote(Note note) {

        return null;
    }

}
