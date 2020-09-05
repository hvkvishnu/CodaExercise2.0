package com.vishnu.codaexrercise.entity;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "notes")
public class Notes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notes_id")
    private Long id;

    @Column(name = "description")
    @NonNull
    private String description;

    public Notes(){

    }

    public Notes(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Notes( String description) {
        this(null, description);
    }

    public Long getId() {
        return id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
