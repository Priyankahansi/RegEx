package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    static Pattern pattern = Pattern.compile("[A-Z]{3,}$");

    public static void main(String[] args) {
        String testString = "PRAJUHANASI";
        Matcher matcher = pattern.matcher(testString);

        if (matcher.matches()) {
            System.out.println("matches");

        } else {
            System.out.println("not matching");
        }
    }
}

