package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

    Pattern pattern = Pattern.compile("(^[a-zA-Z]{3}.?[a-zA-z]{0,3}@[a-zA-Z]{2}.[a-zA-Z]{2}.?[a-zA-Z]{0,2}$)");

    public boolean validEmail(String validEmailName) {
        Matcher matcher = pattern.matcher(validEmailName);
        return matcher.matches();
    }
}
