package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLastName {
    Pattern pattern=Pattern.compile("(^[A-Z]{1}[A-Z a-z]{3})");

    public boolean checkLastName(String lastName){
        Matcher matcher= pattern.matcher(lastName);
        return matcher.matches();
    }
}
