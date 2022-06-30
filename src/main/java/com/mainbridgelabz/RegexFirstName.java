package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFirstName {

    Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");

    public boolean checkName(String name){
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
