package com.testbridgelabz;

import com.mainbridgelabz.PasswordRuleThird;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPasswordRuleThird {
    @Test
    void passwordRuleThird() {
        PasswordRuleThird passwordRuleTwoRef = new PasswordRuleThird();
        boolean result = passwordRuleTwoRef.passwordRuleThird("Ram12345");
        Assertions.assertTrue(result);
    }
}
