package com.cog.backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table(name = "EVENTS")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Title is required")
    @Size(min=3, message= "Title must be at least 3 characters")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Description is required")
    @Size(min=3, message= "Description must be at least 10 characters")
    private String decription;

    @NotNull(message = "Date is required")
    @Column(nullable=false)
    private LocalDate date;

    //Constructors
    public Events() {}

    public Events(String title,String description,LocalDate date){
        this.title=title;
        this.decription=description;
        this.date=date;
    }

    //Getters & Setters
    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
