package com.testbridgelabz;

import com.mainbridgelabz.PasswordRuleTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPasswordRuleTwo {
    @Test
    void passwordRuleTwo() {
        PasswordRuleTwo passwordRuleTwoRef = new PasswordRuleTwo();
        boolean result = passwordRuleTwoRef.passwordRuleTwo("Ram12345");
        Assertions.assertTrue(result);
    }
}
