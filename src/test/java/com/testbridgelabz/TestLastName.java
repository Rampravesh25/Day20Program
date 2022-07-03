package com.testbridgelabz;

import com.mainbridgelabz.RegexLastName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLastName {
    @Test
    void testLastName() {
        RegexLastName regexLastName = new RegexLastName();
        boolean result = regexLastName.checkLastName("Mall");
        Assertions.assertTrue(result);
    }
}
