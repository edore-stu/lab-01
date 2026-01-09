package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    public Date sadDate;

    public Sad(String currentMood) {
        super(currentMood);
    }

    public Date getSadDate() {
        return sadDate;
    }

    public void setSadDate(Date sadDate) {
        this.sadDate = sadDate;
    }

    @Override
    public String moodString() {
        return "Sad";
    }
}
