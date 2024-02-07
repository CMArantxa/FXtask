package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

public class Task {
    private  final String title;
    private final String description;
    private final LocalDate creation;
    private final LocalDate dead;
    private final Boolean status;


    public Task(String title, String description, LocalDate creation, LocalDate dead, boolean status) {
        this.title = title;
        this.description = description;
        this.creation = creation;
        this.dead = dead;
        this.status = status;
    }


    public String title(){
        return title;
    }
    public String description(){
        return description;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public LocalDate dead() {
        return dead;
    }

    public boolean status() {
        return status;
    }
}
