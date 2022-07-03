package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleOne {

    Pattern pattern=Pattern.compile("^[0-9a-zA-Z]{8}$");

    public boolean passwordRuleOne(String passwordChar){
        Matcher matcher=pattern.matcher(passwordChar);
        return matcher.matches();
    }
}
