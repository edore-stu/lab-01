package com.example.petshop;

import java.util.Date;
public class Happy extends Mood{

    public Date happyDate;

    public Happy(String currentMood) {
        super(currentMood);
    }

    public Date getHappyDate() {
        return happyDate;
    }

    public void setHappyDate(Date happyDate) {
        this.happyDate = happyDate;
    }

    @Override
    public String moodString() {
        return "Happy";
    }
}
