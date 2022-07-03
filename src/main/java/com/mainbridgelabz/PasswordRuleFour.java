package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRuleFour {
    Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*_-]).{8,}$");

    public boolean passwordRuleFour(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
