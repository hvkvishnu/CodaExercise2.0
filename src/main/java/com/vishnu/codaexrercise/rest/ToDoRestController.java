package com.vishnu.codaexrercise.rest;

import com.vishnu.codaexrercise.entity.ToDo;
import com.vishnu.codaexrercise.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"/todo"})
public class ToDoRestController {

    @Autowired
    private ToDoRepository toDoRepository;

    @PostMapping( consumes = "application/json", produces = "application/json")
    @CrossOrigin
    public ToDo saveToDo(@RequestBody ToDo toDo){
        return toDoRepository.save(toDo);
    }

    @PostMapping(path="/edit",consumes = "application/json")
    @CrossOrigin
    public void updateTodo(@RequestBody ToDo todo){
        Long id = todo.getId();
        String description = todo.getDescription();
        ToDo oldToDo = toDoRepository.findById(id).orElseThrow(()-> new RuntimeException("Id not found"));
        oldToDo.setDescription(description);
        toDoRepository.save(oldToDo);
    }

    @GetMapping
    @CrossOrigin
    public List<ToDo> getAllTodo(){
        return toDoRepository.findAll();
    }

}
