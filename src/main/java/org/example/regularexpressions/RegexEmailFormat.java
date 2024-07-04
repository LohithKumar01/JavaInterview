package org.example.regularexpressions;

import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexEmailFormat {
    public static void main(String[] args) {
        String emailPattern = "^[a-zA-Z0-9]+([._-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+([.-][0-9a-zA-Z]+)*\\.[a-zA-Z]{3}$";
        System.out.println("Please enter your email: ");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        try {
            if (matcher.matches()) {
                System.out.println("Valid email address.");
            } else {
                System.err.println("Please enter a valid email address.");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Check the pattern.");
        }
    }

}
