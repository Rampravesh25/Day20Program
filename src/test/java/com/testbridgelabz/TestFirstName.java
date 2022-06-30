package com.testbridgelabz;

import com.mainbridgelabz.RegexFirstName;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFirstName {

    @Test
     void testFirstName() {
        RegexFirstName firstName=new RegexFirstName();
        boolean result = firstName.checkName("Ram");
        assertTrue(result);
    }
}
