package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(/* Person person */) {
        if ( person.getCity().equals("Manchester")) {
            isFromManchester = true;
        }
        return isFromManchester;
    }

    public boolean canWatchFilm(/* Person person, int ageLimit*/) {
        boolean watchFilm = false;
        if ( person.getAge() >= ageLimit) {
            watchFilm = true;
        }
        return watchFilm;
    }
    
}