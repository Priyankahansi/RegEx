package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    static Pattern pattern = Pattern.compile("([0-9]*[a-zA-Z]){3,}[0-9a-zA-Z]*$");

    public static void main(String[] args) {
        String testString = "Praju111";
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}



