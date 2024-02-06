package com.example.demo;

import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

public class Task {
    private  final String title;
    private final String description;
    private final String creation;
    private final String dead;
    private final String status;


    public Task(String title, String description, String creation, String dead, String status) {
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

    public String creation() {
        return creation;
    }

    public String dead() {
        return dead;
    }

    public String status() {
        return status;
    }
}
