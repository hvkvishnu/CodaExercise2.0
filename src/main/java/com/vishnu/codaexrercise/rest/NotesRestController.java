package com.vishnu.codaexrercise.rest;

import com.vishnu.codaexrercise.entity.Notes;
import com.vishnu.codaexrercise.entity.Notes;
import com.vishnu.codaexrercise.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesRestController {
    @Autowired
    private NotesRepository notesRepository;

    @PostMapping( consumes = "application/json", produces = "application/json")
    @CrossOrigin
    public Notes saveNotes(@RequestBody Notes notes){
        return notesRepository.save(notes);
    }


    @GetMapping
    @CrossOrigin
    public List<Notes> getAllNotes(){
        return notesRepository.findAll();
    }

}
