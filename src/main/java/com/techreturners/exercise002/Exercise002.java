package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {

        return person.getCity().toUpperCase().equals("MANCHESTER");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge() >= ageLimit;
    }

}