package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSample {

    Pattern pattern = Pattern.compile("^(abc)[.+-]?[0-9]{0,3}(@)[a-z0-9]{1,}.[a-z]{1,}.?[a-z]{1,},?$");

    public boolean emailSample(String emailName) {
        Matcher matcher = pattern.matcher(emailName);
        return matcher.matches();
    }
}
