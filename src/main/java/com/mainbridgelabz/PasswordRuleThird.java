package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleThird {
    Pattern pattern=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8}$");

    public boolean passwordRuleThird(String passwordChar){
        Matcher matcher=pattern.matcher(passwordChar);
        return matcher.matches();
    }
}
