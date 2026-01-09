package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private String currentMood;

    public Mood(String currentMood){
        this.currentMood = currentMood;
    }


    public abstract String moodString();
}
