package com.mainbridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormate {

    Pattern pattern=Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");

    public boolean mobileFormate(String mobileNum){
        Matcher matcher=pattern.matcher(mobileNum);
        return matcher.matches();
    }
}
