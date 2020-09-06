package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return String.valueOf(firstName.charAt(0)) + "." +lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        return 0.0;
    }

    public String reverse(String sentence) {
        return String.println(sentence.reverse().toString());
    }

    public int countLinuxUsers(List<User> users) {
        return 0;
    }
}
