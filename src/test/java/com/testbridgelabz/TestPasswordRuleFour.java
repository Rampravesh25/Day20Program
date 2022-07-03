package com.testbridgelabz;

import com.mainbridgelabz.PasswordRuleFour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPasswordRuleFour {

    @Test
    void testPasswordRuleFour() {
        PasswordRuleFour passwordRuleFourRef = new PasswordRuleFour();
        boolean result = passwordRuleFourRef.passwordRuleFour("ram@1234");
        Assertions.assertTrue(result);
    }
}
