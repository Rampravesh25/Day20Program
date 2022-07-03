package com.testbridgelabz;

import com.mainbridgelabz.ValidEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidEmail {

    @Test
    void testValidEmail() {
        ValidEmail validEmailRef = new ValidEmail();
        boolean result = validEmailRef.validEmail("ram@gmail.in");
        Assertions.assertTrue(result);
    }
}
