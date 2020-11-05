
package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vatPrice = originalPrice + (vatRate * originalPrice / 100);
        return (double) Math.round(vatPrice * 100) / 100;
    }

    public String reverse(String sentence) {
        String revstring = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            revstring = revstring + sentence.charAt(i);
        }
        return revstring;
    };

    public int countLinuxUsers(List<User> users) {
        User usr;
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            usr = users.get(i);
            if (usr.getType().toUpperCase().equals("LINUX")) {
                count++;
            }
        }
        return count;
    }
}
