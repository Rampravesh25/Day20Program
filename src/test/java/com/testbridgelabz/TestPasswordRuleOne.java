package com.testbridgelabz;

import com.mainbridgelabz.PasswordRuleOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPasswordRuleOne {

    @Test
    public void testPasswordRuleOne() {
        PasswordRuleOne passwordRuleOneRef = new PasswordRuleOne();
        boolean result = passwordRuleOneRef.passwordRuleOne("Ram12345");
        Assertions.assertTrue(result);
    }
}
