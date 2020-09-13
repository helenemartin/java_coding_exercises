package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return String.valueOf(firstName.charAt(0)) + "." +lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        return Double.parseDouble(String.format("%.2f", originalPrice * (1 + (vatRate /100))));
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        //doesnt receive actual value
        final String LinuxOpName = "Linux";
        int countLinuxUsers = 0;
        Iterator userIterator = users.iterator();
        
        while (userIterator.hasNext()) {
            User user = (User) userIterator.next();
            if (LinuxOpName.equal(user.getType())) {
                countOfLinuxUsers++;
            }
        }

        return countOfLinuxUsers;
    }
}
