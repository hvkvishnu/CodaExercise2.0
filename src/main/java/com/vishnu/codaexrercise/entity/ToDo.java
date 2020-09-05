package com.vishnu.codaexrercise.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "todo")
public class ToDo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id")
    private Long id;

    @Column(name = "description")
    @NonNull
    private String description;

    public ToDo(){

    }

    public ToDo(Long id, String description) {
        this.id = id;
        this.description = description;
    }
    public ToDo(String description) {
        this(null, description);
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
