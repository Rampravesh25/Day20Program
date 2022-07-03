package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleTwo {

    Pattern pattern=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).{8}$");

    public boolean passwordRuleTwo(String passwordChar){
        Matcher matcher=pattern.matcher(passwordChar);
        return matcher.matches();
    }
}
